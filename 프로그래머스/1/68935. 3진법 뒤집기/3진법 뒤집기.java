import java.util.*;
class Solution {
    public int solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        int num = 0;
        while (true) {
            list.add(n % 3);
            num = n / 3;
            if (n / 3 <= 0) {
                break;
            }

            n = num;
        }

        StringBuilder sb = new StringBuilder();
        for(int a : list) {
            sb.append(a);
        }
        String[] strArr =  sb.reverse().toString().split("");

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += Integer.parseInt(strArr[i]) * Math.pow(3, i);
        }

        return result;
    }
}