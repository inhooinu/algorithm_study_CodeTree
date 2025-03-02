N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]

dxs = [0, 1, 0, -1]
dys = [1, 0, -1, 0]

def in_range(N, x, y):
    return x>=0 and x<N and y>=0 and y<N

result = 0
for i in range(N):
    for j in range(N):

        cnt = 0
        for dx, dy in zip(dxs, dys):
            x = i+dx
            y = j+dy
            if in_range(N, x, y) and arr[x][y]==1:
                cnt += 1
        
        if cnt>=3:
            result += 1

print(result)