class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int turn = 0;
        int cycle = 0;
        
        int tal = 0;
        
            for(int i =1; i<words.length; i++){
            
            for(int j=0; j<i; j++){
                if(words[j].equals(words[i])){
                    tal = 1;
                }
            }
            
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                tal = 1;
            }
            
            if(tal ==1){
                if( (i+1) % n < 1){
                    turn = n;
                }else{
                    turn = (i+1) % n ;
                }
                
                if((i+1) % n == 0){
                    cycle = (i+1) / n;
                }else{
                    cycle = ((i+1) / n) + 1;
                }
                break;
            }
            
        }
            
        
        
        answer[0] = turn ;
        answer[1] = cycle;
        return answer;
    }
}