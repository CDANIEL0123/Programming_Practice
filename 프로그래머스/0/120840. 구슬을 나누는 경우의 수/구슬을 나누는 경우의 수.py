def my_fact(num) :
    answer=1
    for i in range(1,num+1,1) :
        answer*=i
    return answer

def solution(balls, share):
    answer = my_fact(balls) / (my_fact(balls-share) * my_fact(share))
    return answer