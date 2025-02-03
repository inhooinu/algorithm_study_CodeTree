class Member:
    def __init__(self, name, addr, city):
        self.name = name
        self.addr = addr
        self.city = city

n = int(input())

member = []
for _ in range(n):
    name, addr, city = input().split()
    member.append(Member(name, addr, city))

member = sorted(member, key=lambda x: x.name)
print("name", member[-1].name)
print("addr", member[-1].addr)
print("city", member[-1].city)