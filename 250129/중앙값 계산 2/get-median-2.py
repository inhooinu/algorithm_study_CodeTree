n = int(input())
nums = list(map(int, input().split()))

for i in range(n):
    if (i+1)%2==1:
        temp = sorted(nums[:i+1])
        print(temp[i//2], end=" ")