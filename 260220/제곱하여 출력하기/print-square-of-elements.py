N = int(input())
nums = list(map(int, input().split()))
result = [n**2 for n in nums]
for n in result:
    print(n, end=' ')