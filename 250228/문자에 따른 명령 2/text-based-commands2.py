command = list(input())
dx = [1, 0, -1, 0]
dy = [0, -1, 0, 1]

direction = 3
x, y = (0, 0)

for c in command:
    if c=="L":
        direction = (direction-1+4)%4
    elif c=="R":
        direction = (direction+1)%4
    elif c=="F":
        x += dx[direction]
        y += dy[direction]

print(x, y)