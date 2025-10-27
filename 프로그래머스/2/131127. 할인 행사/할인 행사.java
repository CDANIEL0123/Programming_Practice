

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int num_len = number.length;
        
        for(int start = 0; start+10<= discount.length; start++){
            int[] num_clone = new int[num_len];
            for(int i=0; i<num_len; i++){
                num_clone[i] = number[i];
            }
            
            
            for(int i =start; i<start+10; i++){
                for(int j =0; j<want.length; j++){
                    if(discount[i].equals(want[j])){
                        num_clone[j] -=1;
                    }
                }
        }
            
            boolean zero = true;
        
            for(int n :num_clone){
                if(n != 0){
                    zero = false;
                    break;
                }
                }
            
            if(zero){
                answer ++;
            } 
        }
        return answer;
    }
}