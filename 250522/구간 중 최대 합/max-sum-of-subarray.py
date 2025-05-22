N, K = map(int, input().split())
nums = list(map(int, input().split()))

max_sum = 0
for i in range(N-K+1):
    max_sum = max(max_sum, sum(nums[i:i+K]))

print(max_sum)