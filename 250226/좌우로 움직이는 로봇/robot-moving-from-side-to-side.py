N, M = map(int, input().split())
A = [0]
B = [0]

for _ in range(N):
    t, d = input().split()
    t = int(t)

    if d=="L":
        for _ in range(t):
            A.append(A[-1]-1)
    elif d=="R":
        for _ in range(t):
            A.append(A[-1]+1)

for _ in range(M):
    t, d = input().split()
    t = int(t)

    if d=="L":
        for _ in range(t):
            B.append(B[-1]-1)
    elif d=="R":
        for _ in range(t):
            B.append(B[-1]+1)

if len(A) > len(B):
    diff = len(A)-len(B)
    for _ in range(diff):
        B.append(B[-1])
else:
    diff = len(B)-len(A)
    for _ in range(diff):
        A.append(A[-1])

count = 0
for i in range(1, len(A)):
    if A[i-1] != B[i-1] and A[i]==B[i]:
        count += 1

print(count)