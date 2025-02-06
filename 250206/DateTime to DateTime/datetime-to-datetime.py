a, b, c = map(int, input().split())

# 2011년 11월 11일 00시 00분 기준
m1 = 11*60 + 11
m2 = (a-11)*24*60 + b*60 + c

if m2 < m1:
    print(-1)
else:
    print(m2-m1)