class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int size = n * 2;
        int[] ans = new int[size];
        System.out.println(size);
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            ans[n + i] = nums[i];
        }
        return ans;
    }
}