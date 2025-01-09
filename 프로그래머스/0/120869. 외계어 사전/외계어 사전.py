def solution(spell, dic):
    arr=[]
    answer=2
    for i in spell : 
        arr.append(i)
    
    for i in dic :
        print("sorted : %s" %sorted(i))
        if sorted(i) == sorted(arr) :
            answer = 1
    return answer
