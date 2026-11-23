class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int candidate = target - nums[i];

            if(map.containsKey(candidate) && map.get(candidate) != i){
                return new int[]{i,map.get(candidate)};
                
            }
        }
        return new int[]{};
    }
}