def GCD(n,m) :
    gcd=0
    for i in range(1,n+1,1) :
        if n%i ==0 and m%i ==0 :
            gcd = i
    return gcd

def LCM(n,m) :
    return (n*m) / GCD(n,m)

def solution(n, m):
    return [GCD(n,m),LCM(n,m)]