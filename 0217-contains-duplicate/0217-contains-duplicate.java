class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();

        for (int ele : nums) {
            if (!arr.add(ele)) return true;
        }

        return false;
    }
}