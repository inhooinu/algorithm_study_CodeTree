def swap(a, b):
    return (b, a)

n, m = map(int, input().split())

# Write your code here!
n, m = swap(n, m)
print(n, m)