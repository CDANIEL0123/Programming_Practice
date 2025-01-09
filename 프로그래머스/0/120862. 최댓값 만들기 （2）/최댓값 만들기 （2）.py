def solution(numbers):
    numbers.sort()
    answer=max(numbers[-1]*numbers[-2],numbers[0]*numbers[1])
    return answer

def solution(numbers):
    answer = -1000000000
    num_len=len(numbers)
    for i in range(0,num_len-1,1) :
        for j in range(i+1,num_len,1) : 
            if numbers[i]*numbers[j] > answer :
                answer = numbers[i]*numbers[j]
    return answer