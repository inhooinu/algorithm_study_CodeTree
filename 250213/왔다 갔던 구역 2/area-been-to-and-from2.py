N = int(input())
count = [0]*2000
start = 1000

for _ in range(N):
    x, direction = input().split()
    x = int(x)

    if direction=='R':
        for i in range(start, start+x):
            count[i] += 1
        start = start+x
    
    elif direction=='L':
        for i in range(start-1, start-x-1, -1):
            count[i] += 1
        start = start-x

result = 0
for c in count:
    if c>=2:
        result += 1

print(result)