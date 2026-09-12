class Solution {
    // it is no where mention that the nums will be sorted than in that case
    // we can use hashmap, else it would have been sorted then we could have 
    // directly used two pointers approach
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> iMap = new HashMap<>();

        for( int i = 0; i < nums.length; i++ ) {
            int comp = target - nums[i];
            if(iMap.containsKey(comp)) {
                return new int[]{iMap.get(comp), i};
            }
            iMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
