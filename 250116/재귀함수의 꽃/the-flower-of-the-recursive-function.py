def print_nums(n):
    if n==0: return

    print(n, end=" ")
    print_nums(n-1)
    print(n, end=" ")

n = int(input())
print_nums(n)