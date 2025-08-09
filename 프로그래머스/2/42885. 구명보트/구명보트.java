import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] save = new boolean[people.length];
        int pl = people.length;
        int j_limit = 0;
        Arrays.sort(people);
        
        for(int i =pl-1; i>=0; i--){
            if(!save[i]){
                int total = people[i];
                answer++;
                save[i] = true;
                if(total+people[j_limit] <= limit && !save[j_limit]){
                    save[j_limit] = true;
                    j_limit +=1;
                }
            }   
        }

        return answer;
    }
}