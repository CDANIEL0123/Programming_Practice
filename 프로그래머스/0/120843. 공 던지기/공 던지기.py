def solution(numbers, k):
    answer = 0
    num = ((k*2) // len(numbers)) + 1
    numbers = numbers * num
    answer = numbers[(k-1)*2]
    return answer