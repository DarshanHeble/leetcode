class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    void pop(){
        if (!minStack.isEmpty() && stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    int top() {
        return stack.peek();
    }

    int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

//  Stack<Integer> stack;
//     Stack<Integer> min;

//     public MinStack() {
//         stack = new Stack<>();
//         min = new Stack<>();
//     }
    
//     public void push(int val) {
//         stack.push(val);
//         if (!min.isEmpty() && min.peek() < val) min.push(min.peek());
//         else min.push(val);

//     }
    
//     public void pop() {
//         stack.pop();
//         min.pop(); 
//     }
    
//     public int top() {
//         return stack.peek();
//     }
    
//     public int getMin() {
//         return min.peek();
//     }