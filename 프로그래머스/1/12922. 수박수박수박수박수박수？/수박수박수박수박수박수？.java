class Solution {
    public String solution(int n) {
        String answer = "";
        String str = "수박";
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(str.charAt(i % str.length()));
        }
        
        return sb.toString();
    }
}