class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                var temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            if (maxWidth < sizes[i][0]) {
                maxWidth = sizes[i][0];
            }
            
            if (maxHeight < sizes[i][1]) {
                maxHeight = sizes[i][1];
            }
        }
        
        return maxWidth * maxHeight;
        
    }
}