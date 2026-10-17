class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }

            n = n >> 1;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna