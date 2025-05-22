a = list(input())
a = list(map(int, a))

change = False
for i in range(len(a)):
    if a[i] == 0:
        a[i] = 1
        change = True
        break

if not change:
    a[-1] = 0

a = a[::-1]

result = 0
for i in range(len(a)):
    result += a[i]*(2**i)

print(result)