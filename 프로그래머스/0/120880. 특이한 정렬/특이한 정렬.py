def solution(numlist, n):
    answer = []
    cha =[]
    for i in numlist :
        cha.append(abs(n-i))
    
    cha = set(cha)
    sorted_cha = sorted(cha)
    
    for j in sorted_cha :
        imsi =[]
        for k in numlist :
            if (abs(k - n)) == j :
                imsi.append(k)
        if len(imsi) >= 2 :
            imsi = sorted(imsi)
            for i in (len(imsi)-1,0) :
                answer.append(imsi[i])
        else :
            answer.append(imsi[0])
                
        
    print(sorted(cha))
    return answer