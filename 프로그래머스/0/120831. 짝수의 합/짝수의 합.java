class Solution {
    public int solution(int n) {
        
        int result = 0;
        
        for (int i = 0; i <= n; i+=2) {
            if (n % 2 == 0) {
                result += n - i;    
            } else {
                result += (n - 1) - i;    
            }
        }
        
        return result;
    }
}