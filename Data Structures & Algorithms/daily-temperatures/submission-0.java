class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    arr[size++] = j - i;
                    break;
                }
            }
            if (i == size) {
                arr[size++] = 0;
            }
        }
        return arr;
    }
}
