N, T = map(int, input().split())

R, C, D = input().split()
R = int(R)
C = int(C)

dx = [0, 1, -1, 0]
dy = [1, 0, 0, -1]

mapper = {
    "U": 2,
    "D": 1,
    "R": 0,
    "L": 3
}

dir_num = mapper[D]

def in_range(R, C):
    return R>=1 and R<=N and C>=1 and C<=N

for _ in range(T):
    if not in_range(R + dx[dir_num], C + dy[dir_num]):
        dir_num = 3-dir_num
    else:
        R, C = R + dx[dir_num], C + dy[dir_num]

print(R, C)