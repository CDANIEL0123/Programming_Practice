import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        int pointer = 0;
        int point = arr[0];
        arrlist.add(point);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for (int i=0; i<arr.length; i++){
            if(!arrlist.get(pointer).equals(arr[i])) {
                arrlist.add(arr[i]);
                pointer+=1;
            }
        }

        return arrlist;
    }
}