class Score:
    def __init__(self, name, ko, en, math):
        self.name = name
        self.ko = ko
        self.en = en
        self.math = math

n = int(input())
scores = []
for _ in range(n):
    name, ko, en, math = input().split()
    ko = int(ko)
    en = int(en)
    math = int(math)
    scores.append(Score(name, ko, en, math))

scores = sorted(scores, key = lambda x : (-x.ko, -x.en, -x.math))
for s in scores:
    print(s.name, s.ko, s.en, s.math)