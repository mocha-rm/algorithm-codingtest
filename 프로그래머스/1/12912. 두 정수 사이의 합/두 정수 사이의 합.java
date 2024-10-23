class Solution {
    public long solution(int a, int b) {
         long result = 0;

        if (a < b) {
            for (int i = a; i<= b; i++) {
                result += i;
            }
        } else if (b < a) {
            for (int i = b; i <= a; i++) {
                result += i;
            }
        } else {
            return a;
        }
        return result;
    }
}