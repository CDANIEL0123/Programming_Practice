def solution(n):
    answer = 0
    while(1): 
        answer+=1
        if answer%6 == 0 and answer%n == 0 :
            break
    answer/=6
    return answer