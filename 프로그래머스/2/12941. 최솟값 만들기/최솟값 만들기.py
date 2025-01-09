def solution(A,B):
    answer = 0
    arr=[]
    arr2=[]
    lenn=len(A)
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    
    A.sort()
    B.sort(reverse=True)
    for i in range(0,lenn) :
        #for j in range(0,lenn) :
        arr.append(A[i]*B[i])
    
    for k in arr :
        answer+=k
    print(answer)
            

    return answer