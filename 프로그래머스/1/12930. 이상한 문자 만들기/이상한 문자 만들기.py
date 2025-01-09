def solution(s):
    answer =''
    count = 0
    for i in range(len(s)) : 
        print(count)
        if s[i] ==' ' :
            answer += s[i]
            count = 0
            
        elif s[i]!=' ' and count%2 == 0:
            answer += s[i].upper()
            count+=1
            
        else :
            answer += s[i].lower()
            count+=1
    return answer