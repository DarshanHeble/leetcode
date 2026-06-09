class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int n = nums.length;
        int currSum = 0;
        int count = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            currSum += nums[right];

            while (left >= 0 && currSum >= target) {
                count = Math.min(count, right - left + 1);
                currSum -= nums[left];
                left++;
            }
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}