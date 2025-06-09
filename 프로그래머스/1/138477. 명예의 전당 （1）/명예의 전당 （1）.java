import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr= new int[score.length];
        
        for(int i =0; i<score.length; i++){
            answer.add(score[i]);
            Collections.sort(answer, Collections.reverseOrder());
            
            if(answer.size() < k){
                arr[i] = answer.get(i);   
            } else{
                arr[i] = answer.get(k-1);
            }
        }
        return arr;
    }
}