def solution(n):
    answer = 1
    cnt=1
    while answer <= n :
        answer*=(1+cnt)
        cnt+=1
    answer = cnt-1
    return answer