class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        ArrayList<Character> stack = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.add(s.charAt(i));        
            }
            if (map.containsValue(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                } 
                if (s.charAt(i) != map.get(stack.get(stack.size() - 1))) {
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
