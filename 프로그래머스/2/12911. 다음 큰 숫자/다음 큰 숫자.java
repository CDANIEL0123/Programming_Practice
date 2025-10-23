class Solution {
    public int solution(int n) {
        String n_bi = Integer.toBinaryString(n);
        int n_one_count = 0;
        
        for(int i =0; i<n_bi.length(); i++){
            if(n_bi.charAt(i) == '1'){
                n_one_count ++;
            }
        }
        
        while(true){
            n++;
            int n_larger_one_count = 0;
            String larger_n_bi = Integer.toBinaryString(n);
            for(int i=0; i<larger_n_bi.length(); i++){
                if(larger_n_bi.charAt(i) == '1'){
                    n_larger_one_count ++;
                }
            }
            
            if(n_larger_one_count == n_one_count){
                return n;
            }
            
            
        }
    }
}