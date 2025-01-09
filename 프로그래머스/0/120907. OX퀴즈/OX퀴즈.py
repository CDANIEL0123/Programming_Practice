def solution(quiz):
    answer = []
    for i in quiz :
        sik=i.split()
        if sik[1] =='+' :
            if int(sik[0]) + int(sik[2]) == int(sik[4]) :
                answer.append("O")
            else :
                answer.append("X")

        elif sik[1] =='-' :
            if int(sik[0]) - int(sik[2]) == int(sik[4]) :
                answer.append("O")
            else :
                answer.append("X")
    return answer