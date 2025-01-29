class Character:
    def __init__(self, uid, level):
        self.uid = uid
        self.level = level

uid, level = input().split()

charcter1 = Character("codetree", 10)
charcter2 = Character(uid, level)

print("user", charcter1.uid, "lv", charcter1.level)
print("user", charcter2.uid, "lv", charcter2.level)