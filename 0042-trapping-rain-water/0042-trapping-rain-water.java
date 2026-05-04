class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int count = 0;

        int leftMax = 0;
        int rightMax = 0;

        for (int i = 0; i < n; i++) {
            left[i] = leftMax;
            leftMax = Math.max(height[i], leftMax);
        }

        for (int i = n - 1; i >= 0; i--) {
            right[i] = rightMax;
            rightMax = Math.max(height[i], rightMax);
        }

        for (int i = 0; i < n; i++) {
            int val = Math.min(left[i], right[i]);

            // Remove block from val, make sure its not smaller then 0(otherwise negative)
            count += Math.max(0, val - height[i]);
        }

        return count;
    }
}