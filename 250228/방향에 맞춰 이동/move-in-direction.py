N = int(input())
x, y = (0, 0)

for _ in range(N):
    direction, distance = input().split()
    distance = int(distance)

    if direction=="W":
        x -= distance
    elif direction=="S":
        y -= distance
    elif direction == "N":
        y += distance
    elif direction =="E":
        x += distance

print(x, y)