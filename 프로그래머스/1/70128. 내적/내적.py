def solution(a, b):
    lena = len(a)
    answer = 0
    for i in range (0,lena) :
        answer += a[i]*b[i]
    return answer