N, K = map(int, input().split())
blocks = [0]*(N+1)

for _ in range(K):
    a, b = map(int, input().split())
    for i in range(a, b+1):
        blocks[i] += 1

print(max(blocks))