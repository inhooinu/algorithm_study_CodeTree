N = int(input())

digits = []
while True:
    if N < 2:
        digits.append(N)
        break
    
    digits.append(N%2)
    N = N//2

for d in digits[::-1]:
    print(d, end="")