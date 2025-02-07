m1, d1, m2, d2 = map(int, input().split())
A = input()

num_of_days = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
day_of_week = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]

# 2024년 1월 1일 기준 계산
# 2024년 m1월 d1일은 월요일이라 가정
days1 = sum(num_of_days[:m1]) + d1
days2 = sum(num_of_days[:m2]) + d2
days = days2 - days1 + 1

cnt = days//7
if A in day_of_week[:days%7]:
    cnt += 1

print(cnt)