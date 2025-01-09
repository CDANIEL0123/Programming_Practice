def solution(n):
    answer = 2
    for i in range(0,n,1):
        if i**2 ==n :
            answer = 1    
    return answer