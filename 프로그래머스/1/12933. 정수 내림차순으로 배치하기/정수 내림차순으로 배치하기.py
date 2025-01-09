def solution(n):
    answer = ''
    arrn = str(n)
    arrn = list(arrn)
    arrn.sort()
    for i in range(-1,-len(arrn)-1,-1) :
        answer += arrn[i]
    return int(answer)