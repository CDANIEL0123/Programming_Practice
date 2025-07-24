class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i =1; i<n+1; i++){
            int sum = i;
            int j = i;
            while(sum < n) {
                j++;
                sum +=j;
            }
            
            if (sum == n) {
                answer ++;
            }
            
        }
        return answer;
    }
}