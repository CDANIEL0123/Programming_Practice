def solution(s):
    dict ={}
    sumstr=''
    arrnum = ['0','1','2','3','4','5','6','7','8','9']
    answer = ''
    dict ={
    '0':'zero',
    '1':'one',
    '2':"two",
    '3':"three",
    '4':'four',
    '5':'five',
    '6':'six',
    '7':'seven',
    '8':'eight',
    '9':'nine'
    }

    for i in range(len(s)) :
        if s[i] in arrnum :
            answer += s[i]
        elif sumstr in dict.values() :
            for k, v in dict.items():
                if v == sumstr :
                    answer+=k
                    sumstr=''
        else :
            sumstr+=s[i]
            for k, v in dict.items():
                if v == sumstr :
                    answer+=k
                    sumstr=''

    return int(answer)