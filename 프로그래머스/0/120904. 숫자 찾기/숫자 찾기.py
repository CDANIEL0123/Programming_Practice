def solution(num, k):
    answer = -1
    for i in str(num) : 
        if int(i) == k :
            answer=str(num).index(i) +1
    return answer