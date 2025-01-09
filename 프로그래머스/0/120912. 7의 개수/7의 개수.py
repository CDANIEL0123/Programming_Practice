def solution(array):
    answer = 0
    for i in array :
        for j in range(len(str(i))) :
            print(str(i)[j])
            if str(i)[j] == '7' :
                answer +=1
    return answer