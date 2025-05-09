class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String stringx = String.valueOf(x);
        int hap = 0;
        
        for (int i = 0; i < stringx.length(); i++){
            hap +=(stringx.charAt(i) - '0');
        }
        
        if (x%hap == 0){
            answer = true;
        }
    
        
        return answer;
    }
}