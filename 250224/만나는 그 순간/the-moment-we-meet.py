N, M = map(int, input().split())

A = [0]
B = [0]

for i in range(N):
    d, t = input().split()
    t = int(t)

    if d=="L":
        for j in range(t):
            A.append(A[-1]-1)
    elif d=="R":
        for j in range(t):
            A.append(A[-1]+1)

for i in range(M):
    d, t = input().split()
    t = int(t)

    if d=="L":
        for j in range(t):
            B.append(B[-1]-1)
    elif d=="R":
        for j in range(t):
            B.append(B[-1]+1)

for i in range(1, len(A)):
    if A[i]==B[i]:
        print(i)
        break
else:
    print(-1)