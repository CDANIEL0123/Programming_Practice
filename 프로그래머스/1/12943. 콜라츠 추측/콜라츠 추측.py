def solution(num):
    answer = -1
    count=0
    while(count<=500) :
        if num == 1 :
            answer=count
            break
        if num%2 == 0 :
            num/=2
            count+=1
        else : 
            num=num*3 +1
            count+=1
    return answer