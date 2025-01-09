def solution(number, limit, power):
    answer = 0
    yak=[1]
    for i in range(2,number+1) :
        sum = 0
        for j in range(1,int(i**0.5)+1,1):
            if j*j == i :
                sum+=1
            elif i%j == 0 :
                sum+=2
        yak.append(sum)

    for k in yak :
        if k > limit :
            answer += power
        else :
            answer += k
    #print(yak)       
    return answer