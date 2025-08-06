import java.util.HashMap;


class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> want_map = new HashMap<>();
        
        for(int i =0; i<want.length; i++){
            want_map.put(want[i],number[i]);
        }
        
        
        for(int i =0; i<discount.length -9; i++){
            
            boolean avail = true;
            HashMap<String, Integer> dis_map = new HashMap<>();
            for(int j=i; j<i+10;j++){
                
                if(dis_map.containsKey(discount[j])){
                    dis_map.put(discount[j], dis_map.getOrDefault(discount[j],0)+1);
                }else{
                    dis_map.put(discount[j],1);
                }
            }
                
                
                for(String k : want_map.keySet()){
                    if(dis_map.getOrDefault(k,0) < want_map.get(k)){
                        avail = false;
                        break;
                    }
                }
                
                if(avail){
                    answer++;
                }
                
            }
        
        
        return answer;
    }
}