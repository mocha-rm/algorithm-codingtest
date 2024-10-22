class Solution {
    public long solution(long n) {
        long result = 0;
        
        if (Math.sqrt(n) % 1 ==0) {
            double root = Math.sqrt(n);
            result = (long)root + 1;
            return (result * result);
        }
        
        return -1;
    }
}