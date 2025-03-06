N, T = map(int, input().split())

R, C, D = input().split()
R = int(R)
C = int(C)

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

mapper = {
    "U": 2,
    "D": 0,
    "R": 1,
    "L": 3
}

dir_num = mapper[D]

def in_range(R, C):
    return R>=1 and R<=N and C>=1 and C<=N

for _ in range(T):
    R, C = R + dx[dir_num], C + dy[dir_num]

    if not in_range(R, C):
        R, C = R - dx[dir_num], C - dy[dir_num]
        dir_num = abs(2-dir_num)


print(R, C)