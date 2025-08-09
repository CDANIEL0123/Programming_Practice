import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int cl = citations.length;
        
        for(int i =cl-1; i>=0; i--){
            int indexh = cl-i;
            if(indexh <= citations[i]){
                answer = indexh;
            }
        }
        
        
        return answer;
    }
}