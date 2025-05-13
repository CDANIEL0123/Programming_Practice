class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6){
            answer = true;
        }else{
            answer = false;
        }
        
        
        if(answer == true){
            for(int i = 0; i<s.length(); i++){
                if (s.charAt(i) - '0' <0 || s.charAt(i)-'0' > 9){
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}