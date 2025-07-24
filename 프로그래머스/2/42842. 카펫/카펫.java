class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int i=1; i<sum/2; i++){
            int j = sum/i;
            if(yellow == (j-2) * (i-2)){
                if(j>i){
                    answer[0] = j;
                    answer[1] = i;
                }else{
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        
        return answer;
    }
}