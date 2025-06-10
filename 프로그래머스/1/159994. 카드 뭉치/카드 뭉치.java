class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int point1 = 0;
        int point2 = 0;
        
        for (String goal_s : goal) {
            if(point1 < cards1.length && cards1[point1].equals(goal_s)){
                point1++;
            } else if(point2 < cards2.length && cards2[point2].equals(goal_s)){
                point2++;
            } else{
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}