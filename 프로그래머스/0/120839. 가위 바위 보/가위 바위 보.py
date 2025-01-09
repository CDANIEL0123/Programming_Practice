def solution(rsp):
    answer = ''
    str_rsp = str(rsp)
    for i in str_rsp :
        if i == '2' :
            answer+= '0'
        elif i == '0' :
            answer+= '5'
        else : 
            answer+='2'
    return answer