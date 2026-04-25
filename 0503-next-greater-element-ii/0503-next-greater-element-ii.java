class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        int n = nums.length;

        // Initialise all the array value to -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {
            // get the curr element and use mod for not getting array index out of bonds
            int curr = nums[i % n];

            //backtrack all the elements which has NGE
            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                result[stack.pop()] = curr;
            }

            // Only push if the value once, not after it iterates once again
            if (i < n)  stack.push(i);
        }

        return result;
    }
}