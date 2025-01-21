def solution(people, limit):
    answer = 0
    people.sort(reverse=True)
    front = 0
    end = len(people)-1
    
    while front < end :
        
        if people[front] + people[end] > limit :
            print(people[front])
            front+=1
        
        else :
            if people[front] + people[end] <= limit :
                print(people[front])
                front+=1
                print(people[end])
                end -=1
        answer+=1
    if front == end :
        answer+=1
        
    return answer