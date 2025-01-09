def solution(score):
    answer = []
    avg=[]# 75 100 50
    reversed_rank=[]
    for i in score :
        avg.append((i[0]+i[1])/2)
    rank=sorted(avg)
    for i in reversed(rank) :
        reversed_rank.append(i)
    print(avg)
    print(reversed_rank)

    #reversed_rank=reversed(rank) #100 75 50

    for i in avg :
        answer.append((reversed_rank.index(i))+1)

    return answer