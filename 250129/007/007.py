class Class007:
    def __init__(self, code, location, time):
        self.code = code
        self.location = location
        self.time = time

code, location, time = input().split()
my_mission = Class007(code, location, time)

print("secret code :", my_mission.code)
print("meeting point :", my_mission.location)
print("time :", my_mission.time)