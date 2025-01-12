n, m = map(int, input().split())

# Write your code here!
def LCM(n, m):
    num = max(n, m)
    while (True):
        if (num%n==0 and num%m==0):
            print(num)
            break
        else:
            num += 1

LCM(n, m)