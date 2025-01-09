def solution(A, B):
    answer = -1
    for i in range(len(A)) :
        arr=''
        for j in range(len(A)) :
            arr+=A[j-i]
        if arr==B :
            answer=i
            break
        print(arr)
    return answer