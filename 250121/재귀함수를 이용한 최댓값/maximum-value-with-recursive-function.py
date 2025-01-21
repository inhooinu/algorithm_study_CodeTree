def find_max(arr):
    if len(arr)==1:
        return arr[0]
    
    return arr[0] if arr[0] > find_max(arr[1:]) else find_max(arr[1:])

n = int(input())
nums = list(map(int, input().split()))

print(find_max(nums))