class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ele : s.toCharArray()) {
            if (ele == '(')
                stack.push(')');

            else if (ele == '{')
                stack.push('}');

            else if (ele == '[') 
                stack.push(']');

            else if (!stack.isEmpty() && ele == stack.peek()) {
                stack.pop();
            } else
                return false;
        }

        return stack.isEmpty();
    }
}