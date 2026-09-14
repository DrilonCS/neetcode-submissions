
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> stack = new ArrayList<Integer>();

        for (String operation: operations) {
            if (operation.equals("+")) {
                stack.add(stack.get(stack.size() - 2) + stack.get(stack.size() - 1)); 
            } else if (operation.equals("D")) {
                stack.add(stack.get(stack.size() - 1) * 2);
            } else if (operation.equals("C")) {
                stack.remove(stack.size() - 1);
            } else {
                stack.add(Integer.parseInt(operation));
            }
        }

       return stack.stream().mapToInt(a -> a).sum(); 
    }
}