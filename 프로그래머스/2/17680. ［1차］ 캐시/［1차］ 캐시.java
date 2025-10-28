class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cache = new String[cacheSize];
        int[] hiter = new int[cacheSize];
        
        if(cacheSize ==0){
            return cities.length *5;
        }else{
            for(String city : cities){ //캐쉬에 있으면 실행시간 1 더하고 해당 값 히터 0으로 초기화
            boolean youmu = false;
            city = city.toLowerCase();    
            
            for(int c = 0; c<cacheSize; c++){
                if(cache[c]!=null){
                    hiter[c] +=1;
                        if(cache[c].equals(city)){
                        answer +=1;
                        hiter[c] =0;
                        youmu = true;
                    }
                }
            }
            
            if(!youmu){ //캐시에 없으면
                int max_value = 0;
                int max_index = 0;
                answer +=5;
                for(int i=0; i<cacheSize; i++){ //하이터 숫자 가장 큰수(인기없는수) 찾기
                    if(hiter[i]!=0 && hiter[i] > max_value){
                        max_value = hiter[i];
                        max_index = i;
                    }else if(cache[i] == null){
                        max_index = i;
                        break;
                    }
                }
                    
                //캐시에서 해당값 바꿔치기   
                cache[max_index] = city;
                hiter[max_index] = 0;
                }
            }
        }
        
        
        
        
        return answer;
    }
}