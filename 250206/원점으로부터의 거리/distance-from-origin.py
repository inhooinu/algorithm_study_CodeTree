class Coordinate:
    def __init__(self, x, y, num):
        self.x = x
        self.y = y
        self.num = num

n = int(input())
coordinates = []
dist = []

for num in range(1, n+1):
    x, y = map(int, input().split())
    coordinates.append(Coordinate(x, y, num))

for coordinate in coordinates:
    d = abs(coordinate.x) + abs(coordinate.y)
    dist.append((d, coordinate.num))

dist = sorted(dist, key = lambda x: x[0])
for d in dist:
    print(d[1])