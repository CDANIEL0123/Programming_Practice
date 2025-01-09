def solution(absolutes, signs):
    leng=len(absolutes)
    answer=0
    for i in range(0,leng,1) :
        if signs[i] == True:
            answer+= absolutes[i]
        elif signs[i] == False :
            answer-= absolutes[i]
    return answer