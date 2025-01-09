def solution(s):
    strs = str(s)
    if len(strs)%2 == 0 :
        return s[len(strs)//2-1] + s[len(strs)//2]
    else :
        return s[len(strs)//2]