import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> uid = new HashMap<>();
        
        int event = 0;
        
        for(int i = 0; i<record.length; i++){
            String[] i_split = record[i].split(" ");     
            if(i_split[0].equals("Leave")){
                event++;
            } else if(i_split[0].equals("Change")){
                uid.put(i_split[1],i_split[2]);
            }else {
                event++;
                uid.put(i_split[1],i_split[2]);
            }
        }
        
        String[] answer = new String[event];
        int idx = 0;
        for(int j = 0; j<record.length; j++){
            String[] j_split = record[j].split(" ");
            if(j_split[0].equals("Enter")){
                answer[idx++] = uid.get(j_split[1]) + "님이 들어왔습니다.";
            } else if(j_split[0].equals("Leave")){
                answer[idx++] = uid.get(j_split[1]) + "님이 나갔습니다.";
            }
        }
        
        
        return answer;
    }
}