class Solution {
    public int[] solution(int[] arr, int divisor) {
        int arrl = 0;
        
        for (int i : arr) {
            if (i%divisor == 0){
                arrl ++;                
            }
        }
        
        
        int index = 0;
        int[] answer = new int[arrl];
        
        if (arrl == 0){
            return new int[]{-1};
        }
        else{
            for (int i=0; i<arr.length; i++) {
            if (arr[i]%divisor == 0){
                answer[index++] = arr[i];
            }
            }
        }
        
        java.util.Arrays.sort(answer);
        
        return answer;
    }
}