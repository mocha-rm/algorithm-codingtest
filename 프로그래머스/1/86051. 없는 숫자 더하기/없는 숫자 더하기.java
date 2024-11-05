import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

        for(int i = 0; i < numbers.length; i++) {
            if (list.contains(numbers[i])) {
                list.remove(list.indexOf(numbers[i]));
            }
        }
        
        int result = 0;
        for (int num : list) {
            result += num;
        }
        
        return result;
    }
}