class Solution {
    public String solution(String phone_number) {
        String temp = "";
        
        int left = phone_number.length() - 4;
        
        for (int i = 0; i < left; i++) {
            temp += "*";
        }
        
        String str = phone_number.substring(phone_number.length() - 4);
        
        return temp + str;
        
    }
}