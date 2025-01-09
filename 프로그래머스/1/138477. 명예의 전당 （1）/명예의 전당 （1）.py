def solution(k, score):
    answer = []
    rank=[]
    
    for i in range(0,len(score)) :
        if len(rank) < k :
            rank.append(score[i])
            rank.sort()
            
        else : #len(rank)==k :
            if rank[0] < score[i] :
                rank[0] = score[i]
                rank.sort()
            
        answer.append(rank[0])
    return answer