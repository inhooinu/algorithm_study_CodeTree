A_x1, A_y1, A_x2, A_y2 = map(int, input().split())
B_x1, B_y1, B_x2, B_y2 = map(int, input().split())
C_x1, C_y1, C_x2, C_y2 = map(int, input().split())

area = [[0]*2001 for _ in range(2001)]
for i in range(A_x1, A_x2):
    for j in range(A_y1, A_y2):
        area[i][j] = 1

for i in range(B_x1, B_x2):
    for j in range(B_y1, B_y2):
        area[i][j] = 1

for i in range(C_x1, C_x2):
    for j in range(C_y1, C_y2):
        area[i][j] = 0

result = 0
for i in range(2001):
    for j in range(2001):
        if area[i][j] == 1:
            result += 1

print(result)