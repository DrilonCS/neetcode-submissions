class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        ArrayList<Character> stack = new ArrayList<Character>();

        for (char current: s.toCharArray()) {
            if (map.containsKey(current)) {
                stack.add(current);        
            }
            if (map.containsValue(current)) {
                if (stack.isEmpty()) {
                    return false;
                } 
                if (current != map.get(stack.get(stack.size() - 1))) {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }
            }
        }

        if (stack.size() == 1 || !stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
