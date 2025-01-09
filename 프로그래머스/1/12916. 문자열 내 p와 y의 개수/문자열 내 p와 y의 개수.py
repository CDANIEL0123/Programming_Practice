def solution(s):
    lowers=[]
    countp=0
    county=0
    for i in s :
        lowers.append(i.lower())
        
    for i in lowers :
        if i=='p' :
            countp+=1
        elif i =='y' :
            county+=1
            
    if countp==county :
        return True
    else :
        return False