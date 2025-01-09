def solution(participant, completion):
    answer = ''
    participant.sort()
    completion.sort()

    #point_com=0
    #point_par=0    
    #for i in range(point_par,len(participant)) :
     #   for k in range(point_com,len(completion)) :        
      #      if participant[i] ==completion[k] :
       #         participant[i] = '*'
        #        point_com+=1
          #      point_par+=1
           # else :
            #    point_par+=1
    j=0       
    for i in range(0,len(participant)) :
        if j<len(completion) and participant[i] == completion[j] :
            participant[i] = '*'
            completion[j] = '*'
            j+=1

        else :
            pass

        
    for j in participant :
        if j == '*' :
            pass
        else :
            answer+=j
            
    return answer