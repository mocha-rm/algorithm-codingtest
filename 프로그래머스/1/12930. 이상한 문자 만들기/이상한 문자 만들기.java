class Solution {
    public String solution(String s) {
        
        String result = "";
        String[] strArr = s.split("");

        int index = 0;
        
        for (String str : strArr) {
            index = str.equals(" ") ? 0 : index + 1;
            result += index % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }

        return result;
    }
}