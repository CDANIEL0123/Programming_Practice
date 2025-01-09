def solution(cards1, cards2, goal):
    answer = 'Yes'
    p1=0
    p2=0
    for i in goal :
        
        if p1 < len(cards1) and i in cards1[p1] :
            print(cards1[p1])
            p1+=1
            continue
            
        elif p2 < len(cards2) and i in cards2[p2] :
            print(cards2[p2])
            p2+=1
            continue
            
        else :
            answer = 'No'
            break
        
    return answer