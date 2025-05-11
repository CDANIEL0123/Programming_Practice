class Solution {
    public String solution(String s) {
        String answer = "";
        int strn = s.length();
        
        if(strn %2 ==0){
            int point1 = strn/2-1;
            int point2 = strn/2;
            answer += s.charAt(point1);
            answer += s.charAt(point2);
        }
        else{
            int point3 = strn/2;
            answer += s.charAt(point3);
        }
            
        
        return answer;
    }
}