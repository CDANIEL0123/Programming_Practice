def solution(id_pw, db):
    answer = ''
    for i in db :
        if id_pw[0]!=i[0] :
            pass
        else :
            if id_pw[1] != i[1] :
                answer +='wrong pw'
                break
            else :
                answer += 'login'
                break
    if answer =='' :
        answer+='fail'
    return answer