def solution(s):
    answer = ''
    ars = ''.join(sorted(s))
    print(ars)
    for i in range(len(ars)) :
        if ars.count(ars[i]) ==1 :
            answer+=ars[i]
    return answer