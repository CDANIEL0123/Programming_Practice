def solution(lottos, win_nums):
    answer = []
    maxmin=[]
    count=0
    zero=0
    for i in lottos :
        if i in win_nums :
            count+=1            
        elif i == 0 :
            zero +=1
    
    max = count+zero
    min = count
    
    maxmin.append(max)
    maxmin.append(min)
    print(min,max)
    for m in maxmin :
        if m ==6 :
            answer.append(1)
        elif m == 5 :
            answer.append(2)
        elif m == 4 :
            answer.append(3)
        elif m== 3 :
            answer.append(4)
        elif m== 2 :
            answer.append(5)
        else :
            answer.append(6)
        
    return answer