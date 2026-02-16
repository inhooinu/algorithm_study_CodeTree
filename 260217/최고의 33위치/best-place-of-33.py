n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
max_sum = 0

for i in range(n-2):
    for j in range(n-2):
        temp = 0
        for k in range(3):
            temp += sum(arr[i+k][j:j+3])
        max_sum = max(max_sum, temp)

print(max_sum)