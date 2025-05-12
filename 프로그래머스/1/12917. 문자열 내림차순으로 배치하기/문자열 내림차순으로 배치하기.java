class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(s);
        
        int lens = sb.length();
        
        while(answer.length() != lens){
            int min_index = 0;  
            char sb_pointer = sb.charAt(0);
        for (int i=0; i<sb.length();i++){
            if(sb_pointer < sb.charAt(i)) {
                sb_pointer = sb.charAt(i);
                min_index = i;
            }    
        }answer += sb_pointer;
            sb.deleteCharAt(min_index);
        }
        
        return answer;
    }
}