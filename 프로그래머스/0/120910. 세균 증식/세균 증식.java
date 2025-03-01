class Solution {
    public long solution(int n, int t) {
        long number = n;
        for (int i = 1; i <= t; i++) {
            number *= 2;
        }
        
        return number;
    }
}