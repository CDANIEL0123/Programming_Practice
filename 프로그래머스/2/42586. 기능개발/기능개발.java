import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr_answer = new ArrayList<>();
        int[] pro_day = new int[progresses.length];
        

        for(int i =0; i<progresses.length; i++){
            pro_day[i] = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]) ;
        }
        
        int current = pro_day[0];
        int counter = 0;
        for(int j=0; j<pro_day.length; j++){
            
           if(pro_day[j] > current){
                arr_answer.add(counter) ; 
                current = pro_day[j];
                counter = 1;
            }
            
            else{
                counter +=1;
            }
            
            if(j==pro_day.length-1 && counter>0){
                arr_answer.add(counter);
            }
        }
        
        int[] answer = new int[arr_answer.size()];
        for(int i=0; i<arr_answer.size(); i++){
            answer[i] = arr_answer.get(i);
        }
        
        
        return answer;
    }
}