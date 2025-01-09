def solution(arr):
    answer = []
    num=arr[0]
    for i in arr :
        if i <num :
            num=i
    for j in arr :
        if j==num :
            continue
        else :
            answer.append(j)
    if not answer :
        answer.append(-1)
    return answer