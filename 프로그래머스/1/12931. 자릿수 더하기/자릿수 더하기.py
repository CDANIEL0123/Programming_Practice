def solution(n):
    answer = 0
    strn=str(n)
    lenn=len(strn)
    for i in range(0,lenn,1) :
        answer+=int(strn[i])
    return answer