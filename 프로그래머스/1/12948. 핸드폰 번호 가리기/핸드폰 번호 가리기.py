def solution(phone_number):
    answer = ''
    lenp=len(phone_number)
    for i in range(0,lenp,1) :
        if i <lenp-4 :
            answer+='*'
        else :
            answer+=phone_number[i]
        
    return answer