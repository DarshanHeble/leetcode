class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int curr = nums[i];

            if (curr != 0) {
                nums[index++] = curr;
            }
        }

        while (index < n) {
            nums[index] = 0;
            index++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna