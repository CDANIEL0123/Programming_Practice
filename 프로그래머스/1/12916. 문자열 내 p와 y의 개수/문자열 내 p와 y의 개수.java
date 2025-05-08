class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int nump = 0;
        int numy = 0;
        
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                nump ++;
            }
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                numy ++;
            }
        }
        if (nump != numy){
            answer = false;
        }

        return answer;
    }
}