def solution(wallpaper):
    answer = []
    luy=51
    rdy=0
    lux=51
    rdx=0
    
    for l in range(0,len(wallpaper)) :
        if '#' in wallpaper[l] and lux > l :
            lux = l
    
    for i in wallpaper :
        for j in range(0,len(wallpaper[0])) :
            if i[j] == '#' and j < luy :
                luy = j
            
            if i[j] =='#' and j > rdy :
                rdy = j
            
    for k in range(0,len(wallpaper)) :
        if '#' in wallpaper[k] and rdx < k :
            rdx = k
            
    print(lux,luy,rdx+1,rdy+1)
    answer=[lux,luy,rdx+1,rdy+1]
    return answer