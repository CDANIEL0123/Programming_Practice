class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] com = new boolean[n];
        
        
        
        for(int i =0; i<computers.length; i++){
            if(!com[i]){
                answer++;
                dfs(i, computers, com);
            } 
        }
        
        return answer;
    }
    
    public void dfs(int node, int[][] computers, boolean[] com){
        com[node] = true;
        
        for(int j=0; j<computers[node].length; j++){
            if(computers[node][j] == 1 && !com[j]){
                com[j] = true;
                dfs(j, computers, com);
            }
        }
    }
}