class MinStack {
    
    Stack<Integer> main = new Stack<>(), mini = new Stack<>();

    public MinStack() {} // Constructor automatically call thaise

    public void push(int x) {

        main.push(x);

        if (mini.empty() ||
            x <= mini.peek()
        ) { mini.push(x); }
    }

    public void pop() {

        if (main.pop().equals(mini.peek())
        ) { mini.pop(); }
    }

    public int top() {

        return main.peek();
    }

    public int getMin() {

        return mini.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */