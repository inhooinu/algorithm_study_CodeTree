N, M = map(int, input().split())
A = [0]
B = [0]

for _ in range(N):
    v, t = map(int, input().split())
    for _ in range(t):
        A.append(A[-1]+v)

for _ in range(M):
    v, t = map(int, input().split())
    for _ in range(t):
        B.append(B[-1]+v)

cnt = 0
leader = ""

for i in range(len(A)):
    if leader=="":
        if A[i]>B[i]:
            leader = "A"
        elif A[i]<B[i]:
            leader = "B"

    else:
        if leader=="A" and A[i]<B[i]:
            leader="B"
            cnt += 1
        elif leader=="B" and A[i]>B[i]:
            leader="A"
            cnt += 1

print(cnt)