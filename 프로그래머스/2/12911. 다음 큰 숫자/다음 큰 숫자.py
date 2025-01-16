def solution(n):
    answer = 0
    countn = 0
    counta = 0
    num = n
    binn = format(n,'b')
    
    for i in range(0,len(binn)) :
        if binn[i] == '1' :
            countn +=1
            
    while counta != countn :
        num +=1
        binm = format(num,'b')
        for i in range(0,len(binm)) :
            if binm[i] == '1' :
                counta +=1
                
        if countn != counta :
            counta = 0
        
        elif countn == counta :
            answer = num
        
            
    return answer