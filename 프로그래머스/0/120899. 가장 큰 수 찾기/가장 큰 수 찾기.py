def solution(array):
    answer = []
    num=0
    count=-1
    lasnum=0
    for i in array : 
        if i >num :
            num = i
            count +=1
            lasnum = count
        else :
            count +=1
    answer.append(num)
    answer.append(lasnum)
    return answer