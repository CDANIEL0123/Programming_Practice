def solution(bin1, bin2):
    answer = bin(int(bin1,2) + int(bin2,2))
    return answer[2:]




def solutions(bin1, bin2):
    answer = ''
    arr=[]
    maxx = max(len(bin1),len(bin2))
    par=0
    
    for i in range(maxx-1,-1,-1) :
        if int(bin1[i]) + int(bin2[i])+par == 3 :
            arr.append(1)
            par=1
        if int(bin1[i]) + int(bin2[i])+par == 2 :
            arr.append(0)
            par=1
        elif int(bin1[i]) + int(bin2[i])+par == 1:
            arr.append(1)
            par=0
        elif int(bin1[i]) + int(bin2[i])+par == 0:
            arr.append(0)
            par=0
        if i==0 and par == 1 :
            arr.append(1)
    arrr=reversed(arr)
    for i in arrr :
        answer += str(i)
    return answer