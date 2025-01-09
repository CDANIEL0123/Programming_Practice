def solution(numbers, direction):
    answer = []
    leng=len(numbers)
    if direction == 'right' :
        answer.append(numbers[leng-1])
        for i in range(1,leng) :
            answer.append(numbers[i-1])
    else :
        for i in range(0,leng-1) :
            answer.append(numbers[i+1])
        answer.append(numbers[0])
    return answer