def solution(s):
    answer = True
    counta = 0
    countb = 0
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    
    for i in s :
        print(i)
        if i == '(' :
            counta += 1
        elif i == ')' :
            countb += 1
        if countb > counta :
            answer = False
            break
    print(counta,countb)
    if counta == countb :
        answer = True
    else :
        answer = False

    if s[0] == ')' :
        answer = False
    elif s[len(s)-1] == '(' :
        answer = False
        


    return answer