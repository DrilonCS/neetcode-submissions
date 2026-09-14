class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> listOfConsecutives = new ArrayList<Integer>();
        listOfConsecutives.add(0); 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                Integer valueToAdd = listOfConsecutives.get(i) + 1;
                listOfConsecutives.add(valueToAdd);
            } else {
                listOfConsecutives.add(0);
            }
        }
        Integer biggestConsecutive = 0;
        for (Integer consecutive : listOfConsecutives) {
            if (consecutive > biggestConsecutive) {
                biggestConsecutive = consecutive;
            }
        }
        return biggestConsecutive;
    }
}