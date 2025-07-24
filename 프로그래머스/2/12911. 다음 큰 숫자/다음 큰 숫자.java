class Solution {
    public int solution(int n) {
        String n_bi = Integer.toBinaryString(n);
        int n_count =0;
        for(int i =0; i<n_bi.length(); i++){
            if(n_bi.charAt(i)=='1'){
                n_count++;
            }
        }
        
        int large = n;
        int l_count=0;
        while (n_count != l_count){
            large +=1;
            l_count = 0;
            String l_bi = Integer.toBinaryString(large);
            for(int j = 0; j<l_bi.length(); j++){
                if(l_bi.charAt(j)=='1'){
                    l_count++;
                }
            }
        }
        
        return large;
    }
}