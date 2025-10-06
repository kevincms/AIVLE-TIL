# IoU input=sys.stdin.readline
N=int(input())
rect_list=[[] for _ in range(N)]
for i in range(N): rect_list[i]=list(map(int,input().split()))
comp_list=[]
for i in range(N):
    for j in range(i+1,N):
        x1=rect_list[i][0]; y1=rect_list[i][1]; w1=rect_list[i][2]; h1=rect_list[i][3]
        x2=rect_list[j][0]; y2=rect_list[j][1]; w2=rect_list[j][2]; h2=rect_list[j][3]
        xx1=x1+w1; yy1=y1+h1
        xx2=x2+w2; yy2=y2+h2
        
        ww = max(0, min(xx1, xx2) - max(x1, x2))
        hh = max(0, min(yy1, yy2) - max(y1, y2))

        rect_intersec=ww*hh
        rect1=w1*h1; rect2=w2*h2
        rect_union=rect1+rect2-rect_intersec
        comp_rect=rect_intersec/rect_union
        comp_list.append([comp_rect,i+1,j+1])
# print(comp_list)
comp_list.sort(key=lambda x:(-x[0], x[1], x[2]))
# print(comp_list)
print(*comp_list[0][1:])
