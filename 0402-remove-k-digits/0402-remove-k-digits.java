class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        int n = num.length();

        if (k == n) return "0";

        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If there is till elements to be removed
        while (k > 0) {
            stack.pop();
            k--;
        }

        // build the string
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) {
            res.append(stack.pollLast());
        }

        // Remove leading zeros
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        return res.toString() == "" ? "0" : res.toString();
    }
}