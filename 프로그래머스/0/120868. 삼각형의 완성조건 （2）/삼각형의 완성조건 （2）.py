def solution(sides):
    answer = 0
    arr=[]
    maxnum = max(sides)
    minnum = min(sides)
    for i in range(1,maxnum) :
        if i+minnum > maxnum :
            arr.append(i)
            
    for j in range(maxnum,maxnum+minnum) :
        if j <= maxnum + minnum :
            arr.append(j)
            
    arr = set(arr)
    return len(arr)