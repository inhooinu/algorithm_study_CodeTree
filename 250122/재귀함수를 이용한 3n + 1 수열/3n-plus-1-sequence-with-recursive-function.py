def calculate(num, cnt):
    if num==1:
        return num, cnt

    if num%2==0:
        return calculate(num//2, cnt+1)
    else:
        return calculate(num*3+1, cnt+1)

n = int(input())
print(calculate(n, 0)[1])