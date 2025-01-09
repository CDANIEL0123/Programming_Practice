def solution(t, p):
    answer = 0
    lenp=len(p)
    arr=[]
    len_count=0
    for i in range(len(t)-lenp+1) :
        str1=''
        for j in range(lenp) :
            str1+=t[i+j]
        arr.append(str1)

    for i in arr :
        if i <= p :
            answer+=1
    return answer