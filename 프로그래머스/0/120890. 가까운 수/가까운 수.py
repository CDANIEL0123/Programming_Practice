def solution(array, n):
    array.sort()
    dst = abs(array[0] - n)
    answer=array[0]
    for i in array :
        if abs(i-n) < dst :
            answer = i
            dst = abs(i-n)
    return answer