class Solution {
    public long subArrayRanges(int[] nums) {
        return solve(nums, true) - solve(nums, false);
    }

    public long solve(int[] nums, boolean findMax) {
        int n = nums.length;
        long sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || (findMax ? nums[stack.peek()] < nums[i] : nums[stack.peek()] > nums[i])) ) {
                int mid = stack.pop();
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                int rightBoundary = i;

                long count = (long) (mid - leftBoundary) * (rightBoundary - mid);
                sum += count * nums[mid];
            }
            stack.push(i);
        }

        return sum;
    }
}   