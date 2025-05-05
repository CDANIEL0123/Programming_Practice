class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arrn = s.split(" ");
        int max_num = Integer.parseInt(arrn[0]);
        int min_num = Integer.parseInt(arrn[0]);
        
        for(int i =0; i<arrn.length; i++){
            int num = Integer.parseInt(arrn[i]);
            if (num<min_num){
                min_num = num;
            }
            else if (num > max_num){
                max_num = num;
            }
        }
        answer += min_num + " " + max_num;
        return answer;
    }
}