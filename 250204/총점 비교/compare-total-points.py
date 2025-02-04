class Score:
    def __init__(self, name, a, b, c):
        self.name = name
        self.a = a
        self.b = b
        self.c = c

n = int(input())
scores = []

for _ in range(n):
    name, a, b, c = input().split()
    a = int(a)
    b = int(b)
    c = int(c)
    scores.append(Score(name, a, b, c))

scores = sorted(scores, key = lambda x : (x.a + x.b + x.c))
for s in scores:
    print(s.name, s.a, s.b, s.c)