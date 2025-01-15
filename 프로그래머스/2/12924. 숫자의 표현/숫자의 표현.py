def solution(n):
    answer = 0
    arr=[]
    for i in range(1,n+1) : 
        arr.append(i)
        
    print(arr)
    for j in range(0,n+1) :
        summ=0
        k=j        
        while summ <=n and k<n :
            summ+=arr[k]
            k+=1
            if summ == n :
                answer+=1
                break
    return answer