class Solution {
    public String solution(String s) {
        String answer = "";
        int pointer = 0;
        
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' '){
                if( (pointer+1) %2 == 1){
                    char upper = Character.toUpperCase(s.charAt(i));
                    answer += upper;
                }else{
                    char downer = Character.toLowerCase(s.charAt(i));
                    answer += downer;
                }
                pointer += 1;
            }else {
                answer += " ";
                pointer = 0;
                
            }
        }
        
        return answer;
    }
}