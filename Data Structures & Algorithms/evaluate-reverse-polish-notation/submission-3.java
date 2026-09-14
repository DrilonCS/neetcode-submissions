class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (List.of("+", "-", "*", "/").contains(tokens[i])) {
                int result = 0;
                switch (tokens[i]) {
                  case "+" -> result = list.get(list.size() - 2) + list.get(list.size() - 1);
                  case "-" -> result = list.get(list.size() - 2) - list.get(list.size() - 1);
                  case "*" -> result = list.get(list.size() - 2) * list.get(list.size() - 1);
                  default -> result = list.get(list.size() - 2) / list.get(list.size() - 1);
                };
                list.remove(list.size() - 1);
                list.set(list.size() - 1, result);
            } else {
                list.add(Integer.parseInt(tokens[i]));
            }            
        }
        return list.get(0);
    }
}
