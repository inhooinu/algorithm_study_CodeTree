def GCD(n, m):
    start = min(n, m)
    for i in range(start, 1, -1):
        if (n%i==0 and m%i==0):
            return i

n, m = map(int, input().split())
print(GCD(n, m))