def solution(s, n):
    lowerr='abcdefghijklmnopqrstuvwxyz'
    upperr='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    answer = ''
    lens = len(s)
    for i in range(lens) :
        if s[i] in lowerr :
            if (lowerr.index(s[i]))+n >= len(lowerr) :
                answer+=lowerr[(lowerr.index(s[i]))+n-26]
            else :
                answer+=lowerr[(lowerr.index(s[i]))+n]
        elif s[i] in upperr :
            if (upperr.index(s[i]))+n >= len(upperr) :
                answer+=upperr[(upperr.index(s[i]))+n-26]
            else :
                answer+=upperr[(upperr.index(s[i]))+n]
        else :
            answer+=s[i]
    return answer