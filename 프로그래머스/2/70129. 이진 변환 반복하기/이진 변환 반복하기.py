def solution(s):
    answer = []
    count_zero = 0
    count=0
    
    while s != '1' :
        count_one=0
        for i in range(0,len(s)) :
            if s[i] == '1' :
                count_one +=1
        count_zero += len(s) - count_one
        s = format(count_one,'b')
        print(s)
        count+=1
        
            
    answer.append(count)
    answer.append(count_zero)
    return answer