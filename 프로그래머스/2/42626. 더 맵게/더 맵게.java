import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num : scoville){
            pq.add(num);
        }
        
        while(pq.peek() < K && pq.size() > 1){
        
        int first = pq.poll();
        int second = pq.poll();
            
            
        int scob = first + second*2 ;
        answer +=1;
        pq.add(scob);
        
        }
        
        if(pq.peek() < K){
            return -1;
        }
        
        
        return answer;
    }
}