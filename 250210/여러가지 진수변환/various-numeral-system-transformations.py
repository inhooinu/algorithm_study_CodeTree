N, B = map(int, input().split())
nums = []

while True:
    if N < B:
        nums.append(N)
        break

    nums.append(N%B)
    N = N//B

for n in nums[::-1]:
    print(n, end="")