class Solution {
    public boolean hasDuplicate(int[] nums) {
        return hasDuplicateUsingSet(nums);
    }

    // time complexity: O(n); space complexity: O(n)
    private static boolean hasDuplicateUsingSet(int[] nums) {
        Set<Integer> container = new HashSet<>();
        for(int num: nums) {
            if(container.contains(num)) return true;
            else container.add(num);
        }
        return false;
    }
}