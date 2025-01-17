def square_sum(n):
    if n<10:
        return n**2

    return square_sum(n//10) + (n%10)**2

n = int(input())
print(square_sum(n))