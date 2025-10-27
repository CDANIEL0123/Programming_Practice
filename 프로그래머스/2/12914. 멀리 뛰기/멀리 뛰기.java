class Solution {
    public int solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        
        if(n>=2){
            for(int i =2; i<n+1; i++){
            arr[i] = (arr[i-1] + arr[i-2])%1234567;
            }
        }
        return arr[n];
    }
}


//1 ->1 / 2->2 / 3 ->3 / 4-> 5 / 5 -> 8