class Solution {
    public int solution(String t, String p) {
        int result = 0;
        Long compareNumber = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String tempStr = t.substring(i, i + p.length()); //end 에 입력한 전 까지 잘림

            if (Long.parseLong(tempStr) <= compareNumber) {
                result++;
            }
        }

        return result;
    }
}