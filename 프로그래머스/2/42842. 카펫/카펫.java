class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int ga =0;
        int se =0;
        
        for(int i=(sum/2); i>0; i--){
            ga = i;
            se = sum/i;
            if( (ga-2) * (se-2) == yellow){
                break;
            }
        }
        
        answer[0] = ga;
        answer[1] = se;
        
        return answer;
    }
}