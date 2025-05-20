N = int(input())
h = list(map(int, input().split()))

count = 0
for i in range(N):
    for j in range(i+1, N):
        if h[i] > h[j]:
            continue
        for k in range(j+1, N):
            if h[j] > h[k]:
                continue
            count += 1

print(count)
            