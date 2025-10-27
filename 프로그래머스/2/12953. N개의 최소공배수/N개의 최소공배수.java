import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        Arrays.sort(arr);
        
        for(int i =1; i<arr.length; i++){
            int gcd = 0;
            for(int j=1; j<arr[i]+1; j++){
                if(answer%j == 0 && arr[i]%j == 0){
                    gcd = j;
                }
            }
            answer = (answer * arr[i]) / gcd;
        }
        
        return answer;
    }
}