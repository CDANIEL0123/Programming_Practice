import java.util.Arrays;
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for (int i = 0; i<phone_book.length -1; i++){
            int j = i+1;
                for(int k =0; k<Math.min(phone_book[i].length(), phone_book[j].length()); k++){
                    if(phone_book[i].charAt(k) == phone_book[j].charAt(k)){
                        answer = false;
                    } else{
                        answer = true;
                        break;
                    }
                }if(answer == false){
                    return answer;
                }
            
        }
        
        return answer;
    }
}