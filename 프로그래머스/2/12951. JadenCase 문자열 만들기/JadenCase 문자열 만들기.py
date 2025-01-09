def solution(s):
    answer = ''
    num = ['0','1','2','3','4','5','6','7','8','9']
    s2 =s.split(' ')
    for i in range(len(s2)) :
        #print(s2[i][0])
        if s2[i] =='' :
            answer +=' '
        elif s2[i][0].isdigit() :
            answer+=s2[i].lower() + " "
        elif s2[i].isalpha() :
            answer+=s2[i][0].upper() + s2[i][1:].lower() + " "
    answer = answer[:-1]

    return answer

print(solution("3peOple  unFollowed me"))