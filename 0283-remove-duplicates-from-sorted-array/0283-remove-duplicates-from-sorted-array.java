class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            int prev = nums[i - 1];

            if (curr != prev) {
                nums[count++] = curr;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna