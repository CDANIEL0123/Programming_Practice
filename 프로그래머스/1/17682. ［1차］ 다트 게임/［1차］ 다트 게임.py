def solution(dartResult):
    result=[]
    answer = 0
    arr1=[]
    rule = ['S','D','T']
    score = ''
    for i in dartResult :
        if i.isdigit() :
            score += i
        elif i in rule :
            if i == 'D' :
                arr1.append(int(score)**2)
                score=''
            elif i =='T' :
                arr1.append(int(score)**3)
                score=''
            elif i =='S' :
                arr1.append(int(score))
                score=''
        elif i =='*' :
            if len(arr1) > 1 :
                arr1[-1] *= 2
                arr1[-2] *= 2
            else :
                arr1[-1] *= 2
        elif i =='#' :
                arr1[-1] *= -1
    
    #for i in dartResult :
    #    if i.isdigit() :
    #        arr1.append(str1)
    #        str1=''
    #    str1+=i
    
    #for i in range(1,4) :
    #    result.append((dartResult).split(str(i)))
    #print(result)
    #print(dartResult[0])

    #for i in range(0,len(dartResult)) :
    #    if dartResult[i] == '1' :
    #        str1+=dartResult[i]
    #while :
    #while i < len(dartResult) :        
    #    if dartResult[i]==str(j+1) :
    #        arr1.append(str1)
    #        str1=''
    #        str1+=dartResult[i]
    #        i+=1
    #        j+=1
    #            
    #    elif i == len(dartResult)+1 :
    #        break
                
    #    else :
    #        str1+=dartResult[i]
    #        i+=1
    answer = sum(arr1)
    print(arr1)        
    return answer