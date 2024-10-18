class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        int index = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(index)));
            index--;
        }

        return arr;
    }
}