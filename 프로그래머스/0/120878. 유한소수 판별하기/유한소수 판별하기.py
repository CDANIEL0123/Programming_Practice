def solution(a, b):
    answer = 2
    gcb =1
    brr=[]
    for i in range(1,min(a,b)+1) :
        if a%i ==0 and b%i==0 :
            gcb =i
    a = a//gcb 
    b = b//gcb
    b_test=b
    for i in range(2,b_test+1) :
        while b_test%i==0 :
            b_test = b_test//i
            brr.append(i)

    print(brr) 
    if b ==1 :
        answer =1
    else :
        for i in brr :
            if i in [2,5] :
                answer =1
            else :
                answer =2
                break
    return answer
