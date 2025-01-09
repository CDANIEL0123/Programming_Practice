def solution(n, arr1, arr2):
    answer = []
    map1=[]
    map2=[]

    for i in range(0,n,1) :
        b=format(arr1[i],'b')
        c=format(arr2[i],'b')
        map1.append(('0'*n+b) [-n:])
        map2.append(('0'*n+c) [-n:])
    
    for i in range(n) :
        sharp=''
        for j in range(n) :
            if str(map1[i])[j] == '0' and str(map2[i])[j] == '0' :
                sharp+=' '
            else :
                sharp+='#'
        answer.append(sharp)
                
    print(map1)
    print(map2)
    
    return answer