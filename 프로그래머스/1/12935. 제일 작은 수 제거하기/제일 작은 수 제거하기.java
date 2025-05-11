class Solution {
    public int[] solution(int[] arr) {
        int point = 0;
        int ans_point=0;
        
        if (arr.length == 1){
            return new int[]{-1};
        }
        int[] answer = new int[arr.length -1];
        
        for (int i = 0; i< arr.length; i++){
            if (arr[point] > arr[i]){
                point = i;
            }
        }
        
        for (int i =0; i<arr.length; i++){
            if( i != point){
                answer[ans_point] = arr[i];
                ans_point++;
            }
        }
        
        
        return answer;
    }
}