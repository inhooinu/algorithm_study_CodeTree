n = int(input())

# Write your code here!
def printHello(n):
    if (n==0):
        return

    printHello(n-1)
    print("HelloWorld")

printHello(n)