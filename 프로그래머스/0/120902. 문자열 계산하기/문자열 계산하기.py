def solution(my_string):
    answer = 0
    arr = my_string.split()
    num=[]
    yun=['+']
    for i in arr :
        if i =='+' or i=='-' :
            yun.append(i)
        else : 
            num.append(i)
            
    for i in range(len(yun)) :
        if yun[i] == '+' :
            answer += int(num[i])
        elif yun[i] == '-' :
            answer -= int(num[i])
            
    return answer
