def solution(triangle):
    triangle[1][0] = triangle[0][0] + triangle[1][0]
    triangle[1][1] = triangle[0][0] + triangle[1][1]

    for i in range(1,len(triangle)-1) :
        triangle[i+1][0] = triangle[i+1][0] + triangle[i][0]
        triangle[i+1][-1] = triangle[i+1][-1] + triangle[i][-1]
        for j in range(1,len(triangle[i])) :
                       triangle[i+1][j] = max(triangle[i][j] + triangle[i+1][j], triangle[i][j-1] + triangle[i+1][j])
             
    answer=max(triangle[-1])
            
            
        
    return answer