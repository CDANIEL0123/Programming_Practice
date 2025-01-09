def solution(a, b):
    answer = ''
    sum=b
    dict ={'1':'FRI','2':'SAT','3':'SUN','4':'MON','5':'TUE','6':'WED','0':'THU'}
    mon=[31,29,31,30,31,30,31,31,30,31,30,31]
    for i in range(a-1) :
        sum+=mon[i]
    
    answer = list(dict.values())[list(dict.keys()).index(str(sum%7))]
    return answer