n = int(input())

def sum_from_one(n):
    if n==1:
        return 1

    return sum_from_one(n-1) + n

print(sum_from_one(n))