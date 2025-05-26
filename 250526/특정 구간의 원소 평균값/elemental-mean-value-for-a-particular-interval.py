N = int(input())
nums = list(map(int, list(input().split())))
result = 0

for i in range(N):
    for j in range(i, N):
        s = 0
        count = 0
        for k in range(i, j+1):
            s += nums[k]
            count += 1

        if s/count in nums[i:j+1]:
            result += 1

print(result)