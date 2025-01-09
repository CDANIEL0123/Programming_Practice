def solution(answers):
    answer = []
    students=[[1,2,3,4,5], [2,1,2,3,2,4,2,5], [3,3,1,1,2,2,4,4,5,5]]
    point =[0,0,0]
    count = 40*len(answers)
    for i in range(len(answers)) :
        for j in range(3) :
            if students[j][i%len(students[j])] == answers[i%len(answers)] :
                point[j]+=1
    
    for i in range(len(point)) :
        if point[i] == max(point) :
            answer.append(i+1)
    return answer