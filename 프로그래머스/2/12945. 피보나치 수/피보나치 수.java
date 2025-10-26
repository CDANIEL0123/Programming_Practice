class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i = 2; i<n+1; i++){
            fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567; 
            //int 범위를 넘는 숫자가 들어가 오버플로우가 발생할 수 있으니 즉시 연산해줘야
        }
        
        answer = fibo[n];
        
        return answer;
    }
}