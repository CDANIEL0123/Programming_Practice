import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        Map<Integer, Integer> count = new HashMap<>();
        
        
        for(int i : tangerine){
            count.put(i,count.getOrDefault(i,0) +1 );
        }
        
        List<Integer> freq = new ArrayList<>(count.values());
        Collections.sort(freq);
        
        int freq_length = freq.size();
        
        int sum = 0;
        for(int i =freq_length-1; i >= 0; i--){
            sum+= freq.get(i);
            answer++;
            if(sum>= k){
                break;
            }
        }
        
        
        return answer;
    }
}