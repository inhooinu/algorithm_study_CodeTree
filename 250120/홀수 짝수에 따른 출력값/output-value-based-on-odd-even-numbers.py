def calculate(n):
    if (n==1):
        return 1
    if (n==2):
        return 2

    return calculate(n-2) + n

n = int(input())
print(calculate(n))