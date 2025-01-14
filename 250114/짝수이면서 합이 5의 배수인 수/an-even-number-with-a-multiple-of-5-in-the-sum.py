n = int(input())

# Write your code here!
def isSatisfiedNumber(n):
    temp = n//10 + n%10
    
    if (n%2==0 and temp%5==0):
        return True
    else:
        return False

if (isSatisfiedNumber(n)):
    print("Yes")
else:
    print("No")