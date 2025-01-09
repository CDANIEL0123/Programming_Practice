def solution(polynomial):
    answer = ''
    arr=polynomial.split()
    num=['1','2','3','4','5','6','7','8','9']
    numr =0
    numx =0
    print(arr)
    for i in range((len(arr)//2)+1) :
        a = arr[2*i]
        if a.isdigit():
            numr += int(a)
        elif a == "x" :
            numx +=1
        elif a[0].isdigit() and a[1]=='x':
            numx +=int(a[0])            
        elif a[0].isdigit() and a[1].isdigit() :
            numx += int(a[0])*10 + int(a[1])
    print(numx,numr)        
    if numx == 0 and numr != 0:
        answer += str(numr)
    elif numr == 0 and numx != 0 and numx != 1:
        answer += str(numx) + 'x'
    elif numx == 1 and numr != 0:
        answer +='x' +' '+ '+' + ' '+ str(numr)
    elif numx ==1 and numr == 0:
        answer +='x'
    else :
        answer += str(numx) + 'x' +' '+ '+' + ' ' +  str(numr)
    return answer