class Solution {
    public long solution(long n) {
        long answer = -1;
        long jkk = 0;
        
        while (jkk * jkk <= n ) {
            if (jkk * jkk == n){
                answer = (jkk+1) * (jkk+1);
                jkk+=1;
            } else{
                jkk += 1;
            }
        }
        return answer;
    }
}