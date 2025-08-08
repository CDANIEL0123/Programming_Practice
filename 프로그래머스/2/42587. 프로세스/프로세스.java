import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue <int[]> que = new LinkedList<>();
        
        for(int i =0; i<priorities.length; i++){
            que.add(new int[]{priorities[i],i});
        }
        
        while(!que.isEmpty()){
            int[] now = que.poll();
            boolean work = true;
            
            for(int[] q : que){
                if (now[0] < q[0]){
                    work=false;
                    que.add(now);
                    break;
                }
            }
            
            if(work && now[1] == location){
                answer ++;
                break;
                
            }else if(work){
                answer++;
            }
        }
        return answer;
    }
}