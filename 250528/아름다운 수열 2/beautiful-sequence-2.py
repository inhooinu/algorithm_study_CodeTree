N, M = map(int, input().split())
A = list(map(int, list(input().split())))
B = list(map(int, list(input().split())))

count = 0
for i in range(N-M+1):
    nums = A[i:i+M]

    temp = B[:]
    for num in nums:
        if num in temp:
            temp.pop(temp.index(num))
        else:
            break
    
    if not temp:
        count += 1

print(count)