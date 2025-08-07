class Solution {
    public int[] solution(int[] prices) {
        int pri_len = prices.length;
        int[] answer = new int[pri_len];
        
        
        for(int i =0; i<pri_len; i++){
            int count = 0;
                for(int j=i; j<pri_len-1; j++){
                    if(prices[j]>=prices[i]){
                        count++;
                    }else{
                        break;
                    }
                }
            answer[i] = count;
            answer[pri_len-1] = 0;
        }
        return answer;
    }
}