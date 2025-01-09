import re

def solution(my_string):
    answer = 0
    my_str = re.findall('\d', my_string)
    for i in my_str :
            answer += int(i)
    return answer