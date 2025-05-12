class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long pay = 0;
        
        for (long i =0; i<count; i++){
            pay += price * (i+1);
        }
        
        if(pay > money){
            answer = pay - money;
        }
        else {
        }
        
        return answer;
    }
}