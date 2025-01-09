def solution(num_list, n):
    count=0
    total = len(num_list) // n   ##쪼개지는개수

    #answer = [[0] * n] * total  
    answer = []
    for i in range(total) :
        answer.append([])
        for j in range(n) :
            #print(num_list[count])
            answer[i].append(num_list[count])
            #print('answer[%d][%d] : %d'%(i,j,answer[i][j]))
            count+=1      
    return answer
