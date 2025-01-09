def solution(dots):
    answer = 0
    ga=[]
    se=[]
    for i in dots :
        ga.append(i[0])
        se.append(i[1])
    answer = (max(ga)-min(ga)) * (max(se) - min(se))
            
    return answer