n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a = sorted(a)
b = sorted(b)

if a==b:
    print("Yes")
else:
    print("No")