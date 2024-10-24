class Solution {
    public int solution(long num) {
       int count = 0;

        while (true) {
            if (num % 2 ==0) {
                num /= 2;
            } else {
                if (num == 1) {
                    if (count < 1) {
                        return 0;
                    }
                    break;
                }
                num = (num * 3) + 1;
            }

            if (count >= 500) {
                return -1;
            }
            count++;
        }

        return count;
    }
}