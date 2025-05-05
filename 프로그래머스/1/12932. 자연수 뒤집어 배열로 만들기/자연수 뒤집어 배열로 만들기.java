class Solution {
    public int[] solution(long n) {
        
        String strn = String.valueOf(n);
        int len = strn.length();
        int[] answer = new int[len];
        
        for(int i =0; i<len; i++){
            answer[i] = strn.charAt(len-1-i) -'0';
        }
        
        return answer;
    }
}