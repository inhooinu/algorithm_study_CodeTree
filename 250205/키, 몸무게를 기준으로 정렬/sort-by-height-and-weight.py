class Person:
    def __init__(self, name, h, w):
        self.name = name
        self.h = h
        self.w = w

n = int(input())
people = []
for _ in range(n):
    name, h, w = input().split()
    h = int(h)
    w = int(w)
    people.append(Person(name, h, w))

people = sorted(people, key = lambda x: (x.h, -x.w))
for person in people:
    print(person.name, person.h, person.w)