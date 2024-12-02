import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] results = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                results[i] = -1;
                map.put(s.charAt(i), i);
            } else {
                results[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }
        return results;
    }
}