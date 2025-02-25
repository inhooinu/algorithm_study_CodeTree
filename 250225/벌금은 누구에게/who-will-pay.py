N, M, K = map(int, input().split())
count = [0]*(N+1)

for _ in range(M):
    num = int(input())
    count[num] += 1

    if count[num] >= K:
        print(num)
        break
else:
    print(-1)