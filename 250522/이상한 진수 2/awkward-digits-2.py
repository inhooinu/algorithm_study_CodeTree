a = list(input())
a = list(map(int, a))

for i in range(len(a)):
    if a[i] == 0:
        a[i] = 1
        break

a = a[::-1]

result = 0
for i in range(len(a)):
    result += a[i]*(2**i)

print(result)