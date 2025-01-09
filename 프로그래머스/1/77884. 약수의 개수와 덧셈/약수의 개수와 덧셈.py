def yaksu(num) :
    count=0
    for i in range(1,num+1,1) :
        if num%i ==0 :
            count+=1
    return count

def solution(left, right):
    answer = 0
    for i in range (left, right+1, 1) :
        if yaksu(i) % 2 == 0:
            answer+=i
        elif yaksu(i)%2 !=0 :
            answer-=i
    return answer