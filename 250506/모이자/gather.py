import sys

N = int(input())
people = list(map(int, input().split()))

min_sum = sys.maxsize
for i in range(N):
    sum_dist = 0

    for j in range(N):
        dist = abs(i-j)
        sum_dist += people[j] * dist
    
    min_sum = min(min_sum, sum_dist)

print(min_sum)