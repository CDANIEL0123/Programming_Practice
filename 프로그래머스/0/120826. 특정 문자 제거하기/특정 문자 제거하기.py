def solution(my_string, letter):
    answer=my_string
    
    for i in my_string :
        if i==letter :
            answer=my_string.replace(i,'')
            
    return answer