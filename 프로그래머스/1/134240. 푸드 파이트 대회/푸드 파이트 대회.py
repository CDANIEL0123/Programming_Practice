def solution(food):
    answer = ''
    for i in range(1,len(food)) :
        if food[i]//2 > 0 :
            for j in range(food[i]//2) :
                answer += str(i)
    answer +='0'
    for i in range(len(food)-1,-1,-1) :
        if food[i]//2 > 0 :
            for j in range(food[i]//2) :
                answer += str(i)
            
    return answer