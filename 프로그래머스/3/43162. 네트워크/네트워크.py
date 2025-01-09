def dfs(computers,i) :
    if '*' in computers[i] :
        for j in range(0,len(computers[i])) :
            if computers[i][j] == 1 :
                computers[i][j] ='*'
                computers[j][i] ='*'
                dfs(computers,j)

def solution(n, computers):
    answer = 0
    for i in range(0,n) :
        if 1 in computers[i] and '*' not in computers[i]  :
            answer+=1
            for k in range(0,n) :              
                if computers[i][k] ==1 :
                    computers[i][k] = '*'
                    computers[k][i] = '*'
                    dfs(computers,k)
            
    print(computers)
    return answer