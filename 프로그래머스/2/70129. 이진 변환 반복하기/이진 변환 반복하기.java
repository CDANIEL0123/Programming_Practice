class Solution {
    public int[] solution(String s) {
        int count_zero = 0;
        int count_while = 0;
        String binary = s;
        
        while(!binary.equals("1")){
            count_while +=1;
            String non_zero = "";
            for(int i =0; i<binary.length(); i++){
            if(binary.charAt(i) == '1'){
                non_zero += binary.charAt(i);
            }else{
                count_zero +=1;
            }
        }

        binary = Integer.toBinaryString(non_zero.length());
            
        }
        
        int[] answer = {count_while, count_zero};
        
        return answer;
    }
}