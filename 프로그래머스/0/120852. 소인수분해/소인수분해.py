def solution(n):
    answer = []
    num=n
    for i in range(2,n+1) :
        while n%i == 0 :
            n = n/i
            answer.append(i)
    answer = sorted(list(set(answer)))
    return answer