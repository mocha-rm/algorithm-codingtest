import java.util.*;
class Solution {
    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array);
        
        StringBuilder stringBuilder = new StringBuilder();
        for(String str : array) {
            stringBuilder.append(str);
        }
        
        return Long.parseLong(stringBuilder.reverse().toString());
    }
}