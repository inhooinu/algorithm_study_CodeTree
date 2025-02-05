n = int(input())
nums = list(map(int, input().split()))

nums_with_i = []
for i in range(len(nums)):
    nums_with_i.append((nums[i], i))

nums_with_i = sorted(nums_with_i, key = lambda x: x[0])

before_and_after = []
for after, (_, before) in enumerate(nums_with_i):
    before_and_after.append((before, after))

before_and_after = sorted(before_and_after, key = lambda x: x[0])
for i in range(len(before_and_after)):
    print(before_and_after[i][1]+1, end=" ")