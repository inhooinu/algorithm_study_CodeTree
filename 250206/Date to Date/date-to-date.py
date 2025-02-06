num_of_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
m1, d1, m2, d2 = map(int, input().split())

days1 = sum(num_of_days[:m1]) + d1
days2 = sum(num_of_days[:m2]) + d2
print(days2-days1+1)