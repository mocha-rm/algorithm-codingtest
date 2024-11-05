import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        list.remove(list.indexOf(min));
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}