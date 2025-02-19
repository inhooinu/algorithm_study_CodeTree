N = int(input())
nums = [int(input()) for _ in range(N)]

max_count = 0
count = 0
for i in range(N):
    if i >= 1 and nums[i] > nums[i-1]:
        count += 1
    else:
        count = 1
    max_count = max(max_count, count)

print(max_count)