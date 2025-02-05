class Person:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height
        self.weight = weight

people = []
for _ in range(5):
    name, height, weight = input().split()
    height = int(height)
    weight = float(weight)
    people.append(Person(name, height, weight))

print("name")
people1 = sorted(people, key = lambda x: x.name)
for person in people1:
    print("%s %d %.1f" %(person.name, person.height, person.weight))

print()
print("height")
people2 = sorted(people, key = lambda x: -x.height)
for person in people2:
    print("%s %d %.1f" %(person.name, person.height, person.weight))