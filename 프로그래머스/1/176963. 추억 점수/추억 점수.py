def solution(name, yearning, photo):
    answer = []
    for i in photo :
        point=0
        for j in i :
            for k in range(0,len(yearning)) :
                if name[k] == j :
                    point+=yearning[k]
        answer.append(point)                
    
    return answer