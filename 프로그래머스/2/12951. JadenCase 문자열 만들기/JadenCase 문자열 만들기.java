class Solution {
    public String solution(String s) {
        boolean bigger = true;
        String answer = "";
        
        for(int i =0; i<s.length(); i++){
                if(bigger == true){
                answer += Character.toUpperCase(s.charAt(i));
            } else{
                answer += Character.toLowerCase(s.charAt(i));
            }

            if(s.charAt(i) == ' '){
                bigger = true;
            } else{
                bigger = false;
            }
        }
        
        
        
        return answer;
    }
}