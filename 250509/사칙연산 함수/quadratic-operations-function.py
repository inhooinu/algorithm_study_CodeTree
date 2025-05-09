def sum(a, b):
    return a+b

def sub(a, b):
    return a-b

def mul(a, b):
    return a*b

def div(a, b):
    return a//b

a, o, c = input().split()
a = int(a)
c = int(c)

if o=="+":
    result = sum(a, c)
elif o=="-":
    result = sub(a, c)
elif o=="*":
    result = mul(a, c)
elif o=="/":
    result = div(a, c)
else:
    result = False

if result:
    print(f"{a} {o} {c} = {result}")
else:
    print(result)