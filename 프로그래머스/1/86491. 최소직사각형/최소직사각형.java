class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int ga_max = 0;
        int se_max = 0;
        
        for(int i=0; i<sizes.length; i++){
            if (sizes[i][0] < sizes[i][1]){
                int change = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = change;
            } else{
            }
            
            if(sizes[i][0] > ga_max){
                ga_max = sizes[i][0];
            }
            if(sizes[i][1] > se_max){
                se_max = sizes[i][1];
            }
        }
        
        
        
        answer = ga_max * se_max;
        
        return answer;
    }
}