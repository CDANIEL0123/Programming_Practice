def solution(my_string):
    leng=len(my_string)
    answer=''
    for i in my_string :
        answer=i+answer
    return answer