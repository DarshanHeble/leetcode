class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        int oddCount = 0;
        int result = 0;

        for (int right = 0; right < n; right ++) {
            if ((nums[right] & 1) == 1) {
                oddCount++;
            }
            
            while (left >= 0 && oddCount > k) {
                // When you shrink the window check the number you are removing is odd, if yes decrement the oddCount by 1
                if ((nums[left] & 1) == 1) {
                    oddCount--;
                }

                left++;
            }

            result += (right - left + 1);
        }

        return result;
    }
}