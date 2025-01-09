def solution(n):
    answer = []
    #for i in str(n) :
    #    answer.append(int(i))
    #answer.reverse()
    print(str(n))
    n = str(n)
    for i in range(-1,-len(n)-1,-1) :
        numb = str(n)[i]
        print(numb)
        answer.append(int(numb))
    return answer