def abs_values(l):
    l[:] = list(map(abs, l))

N = int(input())
nums = list(map(int, input().split()))
abs_values(nums)

for num in nums:
    print(num, end=' ')