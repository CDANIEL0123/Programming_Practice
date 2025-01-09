def solution(strings, n):
    answer = []
    dict = {}
    for i in strings:
        dict[i] = i[n]
    rank = sorted(dict.items(), key=lambda x: (x[1], x[0]))
    for i in rank:
        answer.append(i[0])
    return answer