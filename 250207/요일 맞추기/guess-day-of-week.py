m1, d1, m2, d2 = map(int, input().split())
num_of_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

# 2011년 1월 1일 기준 계산
days1 = sum(num_of_days[:m1]) + d1
days2 = sum(num_of_days[:m2]) + d2

days = days2-days1
if days%7==0:
    print("Mon")
elif days%7==1:
    print("Tue")
elif days%7==2:
    print("Wed")
elif days%7==3:
    print("Thu")
elif days%7==4:
    print("Fri")
elif days%7==5:
    print("Sat")
elif days%7==6:
    print("Sun")