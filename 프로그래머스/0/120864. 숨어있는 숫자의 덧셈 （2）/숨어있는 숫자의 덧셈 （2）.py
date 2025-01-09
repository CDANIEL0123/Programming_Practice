def solution(my_string):
    answer = 0
    num = ['1','2','3','4','5','6','7','8','9','0']
    my_num=''

    for i in range(len(my_string)) :
        if my_string[i] in num :
            my_num += my_string[i]
            if i == len(my_string)-1:
                    answer+=int(my_num)
                    my_num=''

        else  :
            if my_num != '' :
                answer+=int(my_num)
                my_num=''
    return answer