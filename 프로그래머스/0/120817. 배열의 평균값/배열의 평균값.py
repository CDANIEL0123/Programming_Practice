def solution(numbers):
    answer = 0
    sum=0
    count=len(numbers)
    for i in numbers :
        sum+=i
        
    answer=sum/count
    return answer