def solution(num, total):
    answer = []
    arr =[]
    sum_arr=0
    for i in range(0,num) :
        arr.append(i)
        sum_arr+=i
    
    print(sum_arr)
    print(arr)
    sum = 0

    while sum_arr != total :
        #if sum_arr == total :
            #break
        if total > sum_arr :
            sum_arr=0
            for i in range(len(arr)) :
                arr[i] += 1
            for i in arr :
                sum_arr+=i
        else :
            sum_arr=0
            for i in range(len(arr)) :
                arr[i] -= 1
            for i in arr :
                sum_arr+=i
        print(sum_arr)
            
        
    return arr