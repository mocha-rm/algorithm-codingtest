class Solution {
    public int solution(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 2; ++i) {
            for (int j = i + 1; j < nums.length - 1; ++j) {
                for (int k = j + 1; k < nums.length; ++k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrimeNumber(sum)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
    
    public static boolean isPrimeNumber(int num) {
        int checkedNumber = num / 2;
        for (int i = 2; i < checkedNumber; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}