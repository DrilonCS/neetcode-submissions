class Solution {
    public boolean isValid(String s) {
        Map<String, String> map = Map.of("(", ")", "{", "}", "[", "]");

        ArrayList<String> string = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            string.add(String.valueOf(s.charAt(i)));
        }    

        ArrayList<String> stack = new ArrayList<String>();

        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).contains("(") || string.get(i).contains("[") || string.get(i).contains("{")) {
                stack.add(string.get(i));        
            }
            if (string.get(i).contains(")") || string.get(i).contains("]") || string.get(i).contains("}")) {
                if (stack.isEmpty()) {
                    return false;
                } 
                if (!string.get(i).equals(map.get(stack.get(stack.size() - 1)))) {
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
