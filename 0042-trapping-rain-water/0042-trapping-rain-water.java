class Solution {
    public int trap(int[] h) {
        int sum = 0, rightMax = 0, leftMax = 0;
        int n = h.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // Left Array
        for (int i = 0; i < n; i++) {
            left[i] = leftMax;
            leftMax = Math.max(leftMax, h[i]);
        }

        // right Array
        for (int i = n - 1; i > -1; i--) {
            right[i] = rightMax;
            rightMax = Math.max(rightMax, h[i]);
        }

        for (int i = 0; i < n; i++) {
            int val = Math.min(left[i], right[i]);

            sum += Math.max(0, val - h[i]);
        }


        return sum;
    }
}