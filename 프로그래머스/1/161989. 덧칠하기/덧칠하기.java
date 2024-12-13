
class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m - 1);
        int result = 1;
        
        for(int i : section) {
            if (i >= start && i <= end) {
                continue;
            } else {
                start = i;
                end = i + (m - 1);
                result++;
            }
        }
        return result;
        
    }
}