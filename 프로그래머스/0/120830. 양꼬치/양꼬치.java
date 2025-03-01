class Solution {
    public int solution(int n, int k) {
        int food = n * 12000;
        int drink = k * 2000;
        int service = n / 10;
        
        return food + drink - (service * 2000);
    }
}