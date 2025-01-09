def solution(my_string):
    answer = ''
    mo=['a','e','o','u','i']
    for i in my_string :
        if i in mo :
            continue
        else :
            answer=answer+i
    return answer