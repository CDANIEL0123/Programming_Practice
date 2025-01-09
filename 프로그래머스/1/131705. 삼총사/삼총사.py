def solution(number):
    answer = 0
    pointa = 0
    pointa = 1
    pointb = 2
    
    for i in range(0,len(number)):
        pointa = i
        for j in range(i+1,len(number)) :
            pointb = j
            for k in range(j+1,len(number)) :
                pointc = k
                if number[i] + number[j] + number[k] == 0 :
                    answer +=1
                print(i,j,k)                  
    return answer