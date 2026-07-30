class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            
            stack.push(i);
        }

        return res;
    }
}