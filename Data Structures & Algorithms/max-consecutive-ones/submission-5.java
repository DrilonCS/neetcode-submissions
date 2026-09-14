class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, cons = 0, res = 0;
        for (int i = 0; i < n; i++) {
            cons = (nums[i] == 1) ? cons + 1 : 0;
            res = res <= cons ? cons : res;
        }
        return res;
    }
}