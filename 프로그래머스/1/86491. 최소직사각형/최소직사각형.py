def solution(sizes):
    answer = 0
    ga = 0
    se = 0
    for i in sizes :
        i.sort()
        print(i[1])
        if i[1] > ga :
            ga = i[1]
            
    for i in sizes :
        if i[0] > se :
            se = i[0]
    return ga*se