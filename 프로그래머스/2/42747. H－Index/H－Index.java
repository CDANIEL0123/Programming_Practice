import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        int ci_len = citations.length;
        int pointer = 0;

        // 0 1 3 5 6
        while (answer <= ci_len+1){
            int counter = 0;
            
            for(int i : citations){
                if (i >= answer ){
                    counter ++;
                } else{
                    
                }
            }
            if(counter >= answer){
                answer ++;
            }else{
                answer --;
                break;
            }
        }
        
        
        
        return answer;
    }
}