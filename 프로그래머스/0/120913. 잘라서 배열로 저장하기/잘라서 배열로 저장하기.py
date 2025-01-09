def solution(my_str, n):
    answer = []
    if (len(my_str))%n == 0 :
        len_range = (len(my_str))//n
    else :
        len_range = (len(my_str))//n +1
        
    for i in range(len_range) :
        answer.append(my_str[i*n:(i+1)*n])
        
    return answer

