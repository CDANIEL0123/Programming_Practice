class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int numlen = number.length;
        
        for (int i=0; i<numlen-2; i++){
            for(int j=i+1; j<numlen-1; j++){
                for(int k=j+1; k<numlen; k++){
                    if( number[i] + number[j] + number[k] ==0){
                        answer +=1;
                    }
                }
            }
        }
        return answer;
    }
}