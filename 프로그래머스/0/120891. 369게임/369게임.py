def solution(order):
    answer = 0
    order_str = str(order)
    for i in order_str :
        if int(i) == 0 :
            continue
        elif int(i)%3==0 :
            answer+=1
    return answer