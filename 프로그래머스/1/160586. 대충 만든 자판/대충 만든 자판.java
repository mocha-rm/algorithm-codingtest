import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] counts = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char key = keymap[i].charAt(j);
                int value = map.getOrDefault(key, j + 1);
                map.put(key, Math.min(value, j + 1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                char key = targets[i].charAt(j);

                if (map.containsKey(key)) {
                    counts[i] += map.get(key);
                } else {
                    counts[i] = -1;
                    break;
                }
            }
        }
        return counts;
    }
}