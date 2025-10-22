class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pointa = 1;
        int pointb = 1;
        
        for (int i =0; i<s.length(); i++){
            
            if(s.charAt(i) =='(') {
                pointa ++;
            }else{
                pointb ++;
            }
            
            if(pointb > pointa){
                answer = false;
                break;
            }
            
        }
        
        if(answer == true && pointa != pointb) {
            answer = false;
        }
        
        return answer;
    }
}