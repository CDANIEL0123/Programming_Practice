import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String answer = "";
        HashMap <String, Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        String pt = "";
        
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                answer += s.charAt(i);
            }
            else{
                pt+= s.charAt(i);
                if (map.containsKey(pt)){
                    String a = String.valueOf(map.get(pt));
                    answer += a;
                    pt ="";
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
}