class Solution {

    public int gcdOfOddEvenSums(int n) {

        int sumOdd = 0;
        int sumEven = 0;

        // First n odd numbers
        for (int i = 1; i <= n; i++) {
            sumOdd += (2 * i - 1);
        }

        // First n even numbers
        for (int i = 1; i <= n; i++) {
            sumEven += (2 * i);
        }

        // GCD
        while (sumEven != 0) {
            int temp = sumEven;
            sumEven = sumOdd % sumEven;
            sumOdd = temp;
        }

        return sumOdd;
    }
}