class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder  strn =new StringBuilder(Long.toString(n));
        long maxnum = 0;
        int ipointer=0;
        
        while(strn.length()>0){
           ipointer=0;
            maxnum = 0;
            
            for (int i =0; i<strn.length(); i++){
                if (maxnum < strn.charAt(i)-'0'){
                    maxnum = strn.charAt(i) - '0';
                    ipointer = i;
                }
            }
            answer = answer*10 + maxnum;
            strn.deleteCharAt(ipointer);   
        }
        return answer;
    }
}