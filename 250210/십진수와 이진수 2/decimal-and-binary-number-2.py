N = list(map(int, input()))

N10 = 0
for digit in N:
    N10 = N10*2 + digit

N10 *= 17

N2 = []
while True:
    if N10 < 2:
        N2.append(N10)
        break;
    N2.append(N10%2)
    N10 //= 2

for n in N2[::-1]:
    print(n, end="")