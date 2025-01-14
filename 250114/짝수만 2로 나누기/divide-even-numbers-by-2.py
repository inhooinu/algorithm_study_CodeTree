def divide_evens(nums):
    for i in range(len(nums)):
        if nums[i]%2==0:
            nums[i] = nums[i]//2

n = int(input())
arr = list(map(int, input().split()))

# Write your code here!
divide_evens(arr)
for num in arr:
    print(num, end=" ")