class Solution {
    public String solution(String[] seoul) {
        int num = 0;
        for (int i =0; i<seoul.length; i++){
            //if (seoul[i]=="Kim"){ //이건 참조주소 비교
            if (seoul[i].equals("Kim")){ //이건 참조주소 비교
                num = i;
                break;
            }
        }
        
        String answer = "김서방은 " + num + "에 있다";
        return answer;
    }
}