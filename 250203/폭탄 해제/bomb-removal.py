class Bomb:
    def __init__(self, code, color, second):
        self.code = code
        self.color = color
        self.second = second

code, color, second = input().split()
bomb = Bomb(code, color, second)

print("code :", bomb.code)
print("color :", bomb.color)
print("second :", bomb.second)