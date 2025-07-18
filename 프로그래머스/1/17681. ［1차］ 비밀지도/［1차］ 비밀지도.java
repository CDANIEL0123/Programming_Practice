class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            String bi_arr1 = Integer.toBinaryString(arr1[i]); 
            while (bi_arr1.length() < n){
                bi_arr1 = "0" + bi_arr1 ;
            }
            
            String bi_arr2 = Integer.toBinaryString(arr2[i]); 
            while (bi_arr2.length() < n){
                bi_arr2 = "0" + bi_arr2 ;
            }
            
            String answer_s = "";
            for(int j=0; j<bi_arr2.length(); j++){
                if(bi_arr1.charAt(j)=='1' || bi_arr2.charAt(j) =='1'){
                    answer_s += "#";
                }else{
                    answer_s += " ";
                }
            }
            answer[i] = answer_s;
        }
        
        
        return answer;
    }
}