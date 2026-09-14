
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> stack = new ArrayList<Integer>();

        for (String operation: operations) {
            if (isNumeric(operation) == true) {
                stack.add(Integer.parseInt(operation));
            } else if (operation.equals("+")) {
                stack.add(stack.get(stack.size() - 2) + stack.get(stack.size() - 1)); 
            } else if (operation.equals("D")) {
                stack.add(stack.get(stack.size() - 1) * 2);
            } else if (operation.equals("C")) {
                stack.remove(stack.size() - 1);
            }
        }

       return stack.stream().mapToInt(a -> a).sum(); 
    }

    private boolean isNumeric(String operation) {
        try {
            Integer.parseInt(operation);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}