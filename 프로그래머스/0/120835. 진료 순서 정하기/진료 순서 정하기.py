def solution(emergency):
    answer = []
    rank = []
    for i in emergency :
        rank.append(i)
    rank.sort() # 3 24 76
    rank.reverse() #76 24 3
    for i in emergency :
        if i in rank :
            answer.append(rank.index(i)+1)
    return answer