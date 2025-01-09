def solution(before, after):
    before =list(before)
    after = list(after)
    before.sort()
    after.sort()
    for i in range(len(after)) :
        if before[i] == after[i] :
            answer = 1
        else :
            answer = 0
            break
    return answer