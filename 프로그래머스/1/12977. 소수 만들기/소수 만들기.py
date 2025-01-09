def solution(nums):
    answer = 0
    arr =[]
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    for i in range(len(nums)-2) :
        for j in range(i+1,len(nums)-1):
            for k in range(j+1,len(nums)) :
                arr.append(nums[i]+nums[j]+nums[k])
    #arr=set(arr)
    print(arr)
    for i in arr :
        pan = True
        for j in range(2,i) :
            if i%j == 0 :
                pan = False
                break
        if pan :
            answer+=1
    return answer