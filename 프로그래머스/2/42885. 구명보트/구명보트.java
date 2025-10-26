import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int sum = 0;
        int left = 0;
        int right = people.length - 1;
        
        while (left  <= right) {
            answer +=1;
            if(people[right]+people[left] <= limit){
                left ++;
            }
            right --;
        }
        return answer;
    }
}