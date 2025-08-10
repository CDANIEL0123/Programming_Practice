class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sl = sequence.length;
        int an_len = sl;
        
        int count = 0;
        boolean change = false;
        
        int left = 0;
        int right = 0;
        answer[0] = 0;
        answer[1] = an_len;
        count = sequence[left];
        
        while(true){
            if(count<k){
                if(right==sl-1){
                    break;
                }else{
                    right++;
                    count+= sequence[right];
                }
 
            } else if(count > k){
                if(left == sl-1){
                    break;
                }else{
                    count-= sequence[left];
                    left ++;
                }
          
            } else if(count == k){
                if(right-left < answer[1]-answer[0]){
                    answer[0] = left;
                    answer[1] = right;
                }else if(right==sl-1){
                    break;
                }
                    else{
                        right ++;
                        count+= sequence[right];
                    }
                }
            }
           
        return answer;
    }
}