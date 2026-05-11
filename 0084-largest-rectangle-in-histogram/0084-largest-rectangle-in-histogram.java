class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= n; i ++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > currHeight) {
                int h = heights[stack.pop()];

                int rightBoundary = i;
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();

                int w = rightBoundary - leftBoundary - 1; 
                maxArea = Math.max(maxArea, h * w); 
            }
            stack.push(i);
        }

        return maxArea;
    }
}