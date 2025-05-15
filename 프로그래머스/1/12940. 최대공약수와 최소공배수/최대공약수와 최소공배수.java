class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max_yak = 1;
        for(int i = 1; i<n+1; i++){
            if(n%i == 0 && m%i ==0){
                max_yak = i;
            }
        }
        answer[0] =max_yak;
        
        answer[1] = n*m/max_yak;
        
        
        return answer;
    }
}