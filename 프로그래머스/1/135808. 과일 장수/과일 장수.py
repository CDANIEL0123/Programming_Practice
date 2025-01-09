def solution(k, m, score):
    answer = 0
    sort_score = sorted(score,reverse=True)
    #print(sort_score)

    for i in range(1,len(sort_score)+1) :
        if i*m < len(sort_score)+1 :
            #print(sort_score[i*m-1])
            answer += sort_score[i*m-1] * m 

    print(answer)

    
    return answer