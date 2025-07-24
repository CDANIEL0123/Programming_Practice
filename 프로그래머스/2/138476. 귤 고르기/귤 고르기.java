import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int num : tangerine){
            count.put(num, count.getOrDefault(num,0) +1);
            // int num_count = 0;
            // for(int i=0; i<tangerine.length; i++){
            //     if(tangerine[i]==num){
            //         num_count ++;
            //     }
            // }
            // count.put(num,num_count);
        }
        
        int[] only_count = new int[count.size()];
        int idx = 0;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            only_count[idx] = entry.getValue();
            idx++;
        }
        
        int allcount = 0;
        Arrays.sort(only_count);
        int idxx =only_count.length - 1;
        while (allcount < k){
            allcount += only_count[idxx];
            answer ++;
            idxx--;
        }
        
        return answer;
    }
}