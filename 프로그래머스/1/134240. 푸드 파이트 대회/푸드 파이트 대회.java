class Solution {
    public StringBuilder solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder real_answer = new StringBuilder();
        
        for(int i =1; i<food.length; i++){
            if (food[i]%2 != 0 ){
                food[i] -=1;
            }else {
                
            }
            for (int j=0; j<food[i]/2; j++){
                answer.append(i);
            }
        }
        real_answer.append(answer);
        real_answer.append('0');
        StringBuilder ans_rev = answer.reverse();
        real_answer.append(ans_rev);
 
        return real_answer;
    }
}