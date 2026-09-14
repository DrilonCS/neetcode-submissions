class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, cons = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cons++;
                if (res < cons) {
                    res = cons;
                }
            } else {
                cons = 0;
            }
        }
        return res;
    }
}