def solution(common):
    answer = 0
    cha=0
    bi =0
    for i in range(len(common)-2) :
        if common[i+1] - common[i] == common[i+2] - common[i+1] :
            cha = common[i+1] - common[i]
            answer = common[len(common)-1] + cha
        
        elif common[i+1] / common[i] == common[i+2] / common[i+1] :
            bi = common[i+1] / common[i]
            answer = common[len(common)-1] * bi
    print(cha)
    return answer