import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int nlength = numbers.length;
        for (int i=0; i<nlength-1; i++){
            for (int j=i+1; j<nlength; j++){
                int sum = numbers[i] + numbers[j];
                if(answer.contains(sum)){
                    
                }else{
                    answer.add(sum);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}