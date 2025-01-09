def solution(s):
    answer = ''
    #arr=s.split()
    arr=list(map(int, s.split()))
    answer += str(min(arr)) + " " + str(max(arr))
    
    #answer =  f"{min(arr)} {max(arr)}"
    return answer