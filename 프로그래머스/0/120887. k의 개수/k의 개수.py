def solution(i, j, k):
    answer = 0
    arr =[]
    for a in range(i,j+1) :
        arr.append(a)
    
    for i in arr :
        for j in range(0,len(str(i))) :
                       if str(k) in str(i)[j] : 
                        answer+=1
        
    return answer