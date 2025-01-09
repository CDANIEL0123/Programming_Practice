def solution(array):
    answer = 0
    len_arr = len(array)
    
    for j in range(len_arr-1):
        for i in range(len_arr-1-j) : 
            if array[i] > array[i+1] :
                array[i], array[i+1] = array[i+1], array[i]
    
    if len_arr%2==0 :
        num=len_arr/2
    else :
        num=int(len_arr/2)+1
    
    num=num-1
    answer = array[num]
    
    return answer