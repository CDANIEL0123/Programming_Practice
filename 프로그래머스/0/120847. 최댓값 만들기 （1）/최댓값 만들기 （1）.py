def solution(numbers):
    answer = 0
    leng=len(numbers)
    for i in range(0,leng,1) :
        for j in range(i+1,leng,1) :
            if numbers[i]*numbers[j] > answer :
                answer = numbers[i]*numbers[j]
            else :
                continue
    return answer