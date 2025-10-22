class Solution {
    public String solution(String s) {
        String answer ="";
        //s = s.replaceAll(" ","");
        
        String[] tokens = s.trim().split(" ");
        
        int min_num = Integer.parseInt(tokens[0]);
        int max_num = Integer.parseInt(tokens[0]);
        
        for(int i=0; i<tokens.length; i++){
            int current = Integer.parseInt(tokens[i]);
            
            if ( current > max_num)
                max_num = current ;
            
            if (current < min_num)
                min_num = current ;

        }
        answer += min_num;
        answer += " ";
        answer += max_num;
        return answer;
    }
}