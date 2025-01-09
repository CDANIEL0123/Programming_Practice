def solution(n):
    answer = -1
    if (n**(1/2))%1 == 0 :
        answer = ((n**(1/2))+1)*((n**(1/2))+1)
    return answer