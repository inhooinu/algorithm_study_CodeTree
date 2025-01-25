n = int(input())
nums = list(map(int, input().split()))

nums = sorted(nums)
group_sum = []

for i in range(n):
    group_sum.append(nums[i]+nums[2*n-i-1])

print(max(group_sum))