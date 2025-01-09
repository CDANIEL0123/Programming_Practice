def solution(numer1, denom1, numer2, denom2):
    answer = []
    son = numer1*denom2 + numer2*denom1
    mom = denom1*denom2
    GCD = 1

    
    for i in range(1,mom+1,1) :
        if mom%i==0 and son%i==0 : 
            GCD=i
            

    answer = [son/GCD, mom/GCD]
         
    return answer