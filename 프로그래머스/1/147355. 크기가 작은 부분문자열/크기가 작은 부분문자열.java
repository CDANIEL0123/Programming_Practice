class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plength = p.length();
        
        for (int i=0; i<t.length()-plength+1; i++){
            String substr = t.substring(i,i+plength);
            Long subint = Long.parseLong(substr);
            
            if(subint <= Long.parseLong(p)){
                answer+=1;
            }
        }
        
        return answer;
    }
}