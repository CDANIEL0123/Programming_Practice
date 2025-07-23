class Solution {
    public String solution(String s) {
        String answer = "";
        boolean abc = true;
        
        for(int i=0; i<s.length(); i++){
            
            if(abc == true){
                answer += Character.toUpperCase(s.charAt(i));
            }else{
                answer +=  Character.toLowerCase(s.charAt(i));
            }
            
            if (s.charAt(i) == ' '){
                abc = true;
            } else if(i < s.length() -1 && Character.isDigit(s.charAt(i+1))){
                abc = false;
            } else {
                abc = false;
            }
        }
        
        return answer;
    }
}