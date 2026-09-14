class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set = new HashSet(); 
        for (int num : nums) {
            set.add(num);
        } 
        if (nums.length != set.size()) {
            return true;
        }
        return false;
    }
}