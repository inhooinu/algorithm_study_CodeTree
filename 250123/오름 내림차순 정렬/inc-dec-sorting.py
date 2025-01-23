n = int(input())
nums = list(map(int, input().split()))

nums = sorted(nums)
for num in nums:
    print(num, end=" ")

print()

nums = sorted(nums, reverse=True)
for num in nums:
    print(num, end=" ")