class MinStack {
    ArrayList<Integer> stack = new ArrayList<Integer>();
    ArrayList<Integer> min = new ArrayList<Integer>();
    public MinStack() {
        min.add(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        if (val <= min.get(min.size() - 1)) {
            min.add(val);
        }
        stack.add(val);
    }
    
    public void pop() {
        int val = stack.get(stack.size() - 1);
        if (val == min.get(min.size() - 1)) {
            min.remove(min.size() - 1);
        } 
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
       return min.get(min.size() - 1);
    }
}
