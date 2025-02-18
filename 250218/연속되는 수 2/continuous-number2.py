N = int(input())
nums = []

for _ in range(N):
    num = int(input())
    nums.append(num)

max_count = 0
count = 0
for i in range(len(nums)):
    if i == 0 or nums[i]==nums[i-1]:
        count += 1
        if max_count < count:
            max_count = count
    else:
        count = 1

print(max_count)