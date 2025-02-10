A, B = map(int, input().split())
N = list(map(int, input()))

# A진수를 10진수로 변환
A10 = 0
for n in N:
    A10 = A10*A + n

# 10진수를 B진수로 변환
result = []
while True:
    if A10 < B:
        result.append(A10)
        break;
    result.append(A10%B)
    A10 //= B

for n in result[::-1]:
    print(n, end="")