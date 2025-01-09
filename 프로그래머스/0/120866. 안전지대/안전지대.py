def solution(board):
    answer = 0
    #ans_arr = board
    ans_arr = [row[:] for row in board]
    print(ans_arr)
    for i in range(len(board)) :
        for j in range(len(board[i])) :
            if i ==len(board[i])-1 and j == len(board[i])-1 :
                if board[i-1][j] == 1 or board[i-1][j-1] ==1 or board[i][j-1] ==1 :
                    ans_arr[i][j] = 1
            
            elif i==0 and j == 0 :
                if  board[i+1][j+1] ==1 or board[i][j+1] ==1 or board[i+1][j] ==1 :
                    ans_arr[i][j] = 1
            
            elif i == len(board[i])-1 and j == 0 :
                if board[i-1][j] == 1 or board[i-1][j+1] ==1 or board[i][j+1] ==1 :
                    ans_arr[i][j] = 1
            elif i == 0 and j == len(board[i])-1 :
                if   board[i][j-1] ==1 or board[i+1][j-1] ==1  or  board[i+1][j] ==1 :
                    ans_arr[i][j] = 1
            elif i == 0 :
                if board[i][j-1] ==1 or board[i+1][j-1] ==1 or board[i+1][j+1] ==1 or board[i][j+1] ==1 or board[i+1][j] ==1 :
                    ans_arr[i][j] = 1
            elif i == len(board[i])-1 :
                if board[i-1][j] == 1 or board[i-1][j-1] ==1 or board[i-1][j+1] ==1 or board[i][j-1] ==1 or board[i][j+1] ==1 :
                    ans_arr[i][j] = 1

            elif j == 0 :
                if board[i-1][j] == 1  or board[i-1][j+1] ==1 or board[i+1][j+1] ==1 or board[i][j+1] ==1 or board[i+1][j] ==1 :
                    ans_arr[i][j] = 1
            elif j == len(board[i])-1 :
                if board[i-1][j] == 1 or board[i-1][j-1] ==1 or board[i][j-1] ==1 or board[i+1][j-1] ==1 or board[i+1][j] ==1 :
                    ans_arr[i][j] = 1
            else :
                if board[i-1][j] == 1 or board[i][j+1]==1 or board[i+1][j+1] ==1 or board[i-1][j+1] ==1 or board[i-1][j-1] ==1 or board[i][j-1] ==1 or board[i+1][j-1] ==1 or board[i+1][j] ==1 :
                    ans_arr[i][j] = 1


    for i in ans_arr :
        answer += i.count(0)
    print(answer)
    print(ans_arr)
    print(board)
    return answer

print(solution([[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]))