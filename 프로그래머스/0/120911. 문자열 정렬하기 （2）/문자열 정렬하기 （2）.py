def solution(my_string):
    answer = ''
    list=[]
    for i in my_string :
        list.append(i.lower())
        list.sort()
    for j in list :
        answer+=j

    return answer