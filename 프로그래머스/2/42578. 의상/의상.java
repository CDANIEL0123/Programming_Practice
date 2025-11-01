import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        //같은거 3개일때 3 
        //같은거 2개 + 1개일떄 
        //총개수(각자1개씩) + 종류별곱한값
        //answer += clothes.length;
        Map<String, Integer> clo = new HashMap<>();
        
        for(int i =0; i<clothes.length; i++){
            clo.put(clothes[i][1], clo.getOrDefault(clothes[i][1],0) + 1);
        }
        
        int ans = 1;
            for(int j : clo.values()){
            ans *= (j+1);
        }
        answer = ans -1;
        return answer;
    }
}