class Solution {
    public int[] solution(String s) {
        int count_zero = 0;
        int count_while = 0;
        int[] answer = new int[2];
       
        while (!s.equals("1")){
            count_while ++;
            String del_zero = "";
            
            for(int i =0; i<s.length(); i++){
                if(s.charAt(i) =='1'){
                    del_zero += "1";
                } else{
                    count_zero ++;
                }
            }
            s = Integer.toBinaryString(del_zero.length());
        }
        
        answer[0] = count_while;
        answer[1] = count_zero;

        return answer;
    }

}