def solution(s):
    answer = ''
    up=[]
    down=[]
    for i in s :
        if i.isupper() :
            up.append(i)
        up.sort()
        up.reverse()
    for j in s :
        if j.islower() :
            down.append(j)
        down.sort()
        down.reverse()
    answer="".join(down+up)
    return answer