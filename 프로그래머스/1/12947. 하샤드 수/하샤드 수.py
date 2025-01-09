def solution(x):
    num=0
    for i in str(x) :
        num+=int(i)
    print(num)
    if x%num ==0 :
        return True
    else :
        return False