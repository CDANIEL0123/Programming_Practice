def num_func(strs) :
    strs=list(str(strs))
    ans=True
    print(strs)
    num=['0','1','2','3','4','5','6','7','8','9']
    for i in strs :
        if i in num :
           continue
        else :
            ans=False
    return ans
        
def solution(s):
    if len(s)==4 and num_func(s)==True :
        answer = True
    elif  len(s)==6 and num_func(s)==True :
        answer = True
    else :
        answer = False
    return answer
    