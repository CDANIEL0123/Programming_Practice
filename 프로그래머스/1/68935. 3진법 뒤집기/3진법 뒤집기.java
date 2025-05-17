class Solution {
    public int solution(int n) {
        int answer = 0;
        int mok = n;
        int nmg = 0;
        String three ="";
        
                
        if(mok < 3){
            three += String.valueOf(mok);
        }
        
        while (mok>= 3){
            nmg = mok%3;
            mok = mok/3;
            three += String.valueOf(nmg);
            if(mok < 3){
                three +=  String.valueOf(mok);
            }
        }
        
        
        int pointer = three.length() -1;
        for (int i =0; i<three.length(); i++){
            int inti = Integer.parseInt(String.valueOf(three.charAt(pointer)));
            
            for(int j = 0; j<i; j++){
                inti *= 3;
            }
            answer += inti;
            pointer -=1;
        }
        
                return answer;
    }
}