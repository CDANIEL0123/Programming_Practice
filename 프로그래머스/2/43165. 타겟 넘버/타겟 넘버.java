class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int idx = 0;
        int sum =0;
        answer = dfs(numbers,target,idx,sum);
        return answer;
    }
    
    private int dfs(int[] numbers, int target, int idx, int sum){
        if(idx == numbers.length){
            if(sum==target){
                return 1;
            } else{
                return 0;
            }
            
        }else{
            int plus = dfs(numbers,target,idx+1,sum+numbers[idx]);
            int minus = dfs(numbers,target,idx+1,sum-numbers[idx]);
            return plus + minus;
        }
    }
}