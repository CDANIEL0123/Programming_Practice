import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        int com_len = commands.length;
        
        for(int i=0; i<com_len; i++){
            int start = commands[i][0]-1; //1
            int end = commands[i][1]; //5
            int new_len = end- start;
            int[] arr = new int[new_len];
            
            for(int j=start; j<end; j++){
                arr[j-start] = array[j];
            }
                
            Arrays.sort(arr);
            answer.add(arr[commands[i][2]-1]);
        }
        return answer;
    }
}