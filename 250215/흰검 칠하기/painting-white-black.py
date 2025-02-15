N = int(input())
tiles = [[0, 0, -1] for _ in range(200000)]  # [흰색으로 칠해진 횟수, 검정색으로 칠해진 횟수, 현재 타일 색(0: 흰색, 1: 검정색, 2: 회색)]

cur = 100000
for _ in range(N):
    x, direction = input().split()
    x = int(x)

    if direction=='L':
        for i in range(cur, cur-x, -1):
            tiles[i][0] += 1
            tiles[i][2] = 2 if tiles[i][0] >= 2 and tiles[i][1] >= 2 else 0
        cur = cur-x+1
    else:
        for i in range(cur, cur+x, 1):
            tiles[i][1] += 1
            tiles[i][2] = 2 if tiles[i][0] >= 2 and tiles[i][1] >= 2 else 1
        cur = cur+x-1

white = 0
black = 0
gray = 0
for tile in tiles:
    if tile[2] == 0:
        white += 1
    elif tile[2] == 1:
        black += 1
    elif tile[2] == 2:
        gray += 1

print(white, black, gray)