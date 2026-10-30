import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {

        if (k == 0) return -1;

        // Build adjacency list
        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        // dist[node][count]
        int[][] dist = new int[n][k + 1];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Priority Queue: {cost, node, count}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        dist[0][1] = 0;
        pq.offer(new int[]{0, 0, 1});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int cost = curr[0];
            int node = curr[1];
            int count = curr[2];

            if (cost != dist[node][count]) {
                continue;
            }

            if (node == n - 1) {
                return cost;
            }

            for (int[] next : graph[node]) {

                int nextNode = next[0];
                int weight = next[1];

                int newCount;

                if (labels.charAt(node) == labels.charAt(nextNode)) {
                    newCount = count + 1;
                } else {
                    newCount = 1;
                }

                if (newCount > k) {
                    continue;
                }

                if (cost + weight < dist[nextNode][newCount]) {

                    dist[nextNode][newCount] = cost + weight;

                    pq.offer(new int[]{
                        cost + weight,
                        nextNode,
                        newCount
                    });
                }
            }
        }

        return -1;
    }
}