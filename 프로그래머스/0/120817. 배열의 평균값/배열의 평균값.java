class Solution {
    public double solution(int[] numbers) {
        
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        
        double avg = sum / (double)numbers.length;
        return avg;
        
    }
}