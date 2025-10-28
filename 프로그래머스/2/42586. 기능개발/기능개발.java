import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int pointer = 0;
        int[] answer = new int[progresses.length];
        
        for(int i =0; i<speeds.length; i++){
            if((100-progresses[i])%speeds[i] == 0){
                answer [i] = (100-progresses[i])/speeds[i];
            }else{
                answer [i] = (100-progresses[i])/speeds[i] +1;
            }
        } // [7,3,11]
        
        int index = 0;
        int dungi=0;
        for(int i =0; i<answer.length; i++){
            if(answer[i] > index){
                index = answer[i];
                int count = 0;
                dungi++;
            }
        }
        int[] real_answer = new int[dungi];
        
        int dungi_num = 0;
        int indexx = answer[0];
        real_answer[dungi_num]++;
        //5 10 1 1 20 1
        
        for(int j = 1; j<answer.length; j++){
            if(answer[j] <= indexx){
                real_answer[dungi_num] ++;
            }else{
                dungi_num++;
                indexx = answer[j];
                real_answer[dungi_num] ++;
            }
        }
        
        
        
        return real_answer;
        
    }
}