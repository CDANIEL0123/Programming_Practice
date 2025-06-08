class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int na = 0;
        while(n >= a){
            int mok = n / a;
            answer += mok * b;
            n = (mok*b) + (n % a);
        }
        
        return answer;
    }
}