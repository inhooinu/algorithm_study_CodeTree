n = list(map(int, input()))
n10 = 0

for i in range(len(n)):
    n10 = n10*2 + n[i]

print(n10)