def find_max(arr):
    l = len(arr)

    if l==1:
        return arr[0]

    return arr[-1] if arr[-1] > find_max(arr[:l-1]) else find_max(arr[:l-1])

n = int(input())
nums = list(map(int, input().split()))

print(find_max(nums))