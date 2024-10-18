class Solution {
    public int solution(int n) {
        int input = 1;
        
        while (true) {
            if (n % input == 1) {
                break;
            }
            
            input++;
        }
        
        return input;
    }
}