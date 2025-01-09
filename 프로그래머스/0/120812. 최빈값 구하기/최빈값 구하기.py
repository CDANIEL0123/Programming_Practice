
def solution(array):
    arr= []
    leng_array=len(array)
    for i in array :
            if i not in arr :
                arr.append(i)
            else :
                continue
    leng=len(arr)
    arr2=[0]*leng
    for j in range(0,leng,1) :
        for k in range(0,leng_array,1):
            if arr[j] == array[k] :
                arr2[j]+=1

    answer=arr[arr2.index(max(arr2))]
    count=max(arr2)
    arr2[arr2.index(max(arr2))]=0
    print(count)
    print(arr2)
    for a in arr2 :
        if a ==count :
            answer=-1
            break
    return answer