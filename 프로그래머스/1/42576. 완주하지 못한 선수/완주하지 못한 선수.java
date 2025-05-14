import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> parMap = new HashMap<>();
        
        for (String s : participant){
            if(parMap.containsKey(s)){
                parMap.put(s, parMap.get(s) + 1);
            }
            else{
                parMap.put(s,1);
            }
        }
        
        for( String a : completion){
            if(parMap.containsKey(a)){
                parMap.put(a,parMap.get(a) - 1);
            }
        }
            
        for(String name : parMap.keySet()) {
            if (parMap.get(name) != 0) {
                answer += name;
            }
        }
        
        return answer;
    }
}