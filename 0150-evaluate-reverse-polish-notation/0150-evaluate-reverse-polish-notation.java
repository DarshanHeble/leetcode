class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String ele = tokens[i];

            switch(ele) {
                case "+": {
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    int num3 = num1 + num2;
                    stack.push(num3);
                    break;
                }
                case "-": {
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    int num3 = num1 - num2;
                    stack.push(num3);
                    break;
                }
                case "/": {
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    int num3 = num1 / num2;
                    stack.push(num3);
                    break;
                }
                case "*": {
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    int num3 = num1 * num2;
                    stack.push(num3);
                    break;
                }
                default: {
                    stack.push(Integer.parseInt(ele));
                }
            }
        }

        return stack.pop();
    }
}