def calculate(num):
    if num < 10:
        return num

    return calculate(num//10) + num%10

a, b, c = map(int, input().split())
print(calculate(a*b*c))

