def solution(cipher, code):
    answer = ''
    ci_len=len(cipher)
    for i in range(code-1,ci_len,code) :
        answer+= cipher[i]
    return answer