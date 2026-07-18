class Solution {
    public boolean check(int[] nums) {
        int rotation = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (rotation > 1) return false;
            if (nums[i - 1] > nums[i]) {
                rotation++;
            }
        }

        if (rotation == 1 && nums[0] < nums[n - 1]) return false;
        if (rotation > 1) return false;

        return true;
    }
}