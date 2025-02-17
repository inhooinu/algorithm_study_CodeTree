area = [[0]*201 for _ in range(201)]

N = int(input())
for _ in range(N):
    x, y = map(int, input().split())
    for i in range(x, x+8):
        for j in range(y, y+8):
            area[i][j] += 1

result = 0
for i in range(201):
    for j in range(201):
        if area[i][j] > 0:
            result += 1;

print(result)