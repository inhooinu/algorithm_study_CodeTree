N, M = map(int, input().split())
arr = [[0]*M for _ in range(N)]

dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]

def in_range(x, y):
    return x < N and x >= 0 and y < M and y >= 0 

x, y = 0, 0
dir_num = 0

arr[x][y] = 1
for i in range(2, N*M+1):
    temp_x = x + dx[dir_num]
    temp_y = y + dy[dir_num]

    if not in_range(temp_x, temp_y) or arr[temp_x][temp_y] != 0:
        dir_num = (dir_num+1)%4

    x = x + dx[dir_num]
    y = y + dy[dir_num]
    arr[x][y] = i

for i in range(N):
    for j in range(M):
        print(arr[i][j], end=" ")
    print()