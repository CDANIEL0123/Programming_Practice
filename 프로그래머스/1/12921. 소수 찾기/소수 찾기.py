def solution(n):
    ans_arr=[2]

    for i in range(3,n+1,2) :
        pan =True
        for j in range(2,int(i**0.5)+1,1) :
            if i%j == 0 :
                pan = False
                break
        if pan==True :
            ans_arr.append(i)
             
    return len(ans_arr)