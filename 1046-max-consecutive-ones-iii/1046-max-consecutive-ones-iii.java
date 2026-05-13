class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right;
        int zeroCount = 0;
        int max = 0;

        for (right = 0; right < nums.length; right++) {
            // 1. Expand the head
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink the tail
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}