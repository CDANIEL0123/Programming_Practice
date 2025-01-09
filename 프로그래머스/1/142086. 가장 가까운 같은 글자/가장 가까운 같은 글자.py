def solution(s):
    answer = []
    arr=[]
    strr=[]
    arr = list(s)
    #print(arr)

    for i in arr :
        if i not in strr :
            answer.append(-1)
            strr.append(i)
        else :
            ind=[]
            for j in range(len(strr)) :
                if strr[j]==i :
                    ind.append(j)

            strr.append(i)
            #print(strr,ind)
            answer.append(len(strr)-max(ind)-1)

    return answer