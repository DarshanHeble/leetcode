class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            maxArea = Math.max(maxArea, calculateArea(heights));
        }

        return maxArea;
    }

    public static int calculateArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > h) {
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;
                max = Math.max(max, height * width);
            }

            stack.push(i);
        }

        return max;
    }
}