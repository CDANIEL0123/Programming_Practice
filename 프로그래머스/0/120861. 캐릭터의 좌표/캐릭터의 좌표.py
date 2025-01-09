def solution(keyinput, board):
    answer = [0,0]
    max_size=[board[0]//2,board[1]//2]
    print(max_size)
    
    for i in keyinput :
        if i =='up' and answer[1] < max_size[1] :
            answer[1] += 1
        elif i=='down'and answer[1] > -max_size[1] :
            answer[1] -= 1
        elif i=='right'and answer[0] < max_size[0] :
            answer[0] += 1
        elif i=='left' and answer[0] > -max_size[0] :
            answer[0] -= 1
    return answer