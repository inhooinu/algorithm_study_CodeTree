N, K = map(int, input().split())
placed = [0]*10000

for _ in range(N):
    location, alphabet = input().split()
    location = int(location)-1
    
    if alphabet == 'G':
        score = 1
    elif alphabet == 'H':
        score = 2
    
    placed[location] = score

max_score = 0
for i in range(10000-K):
    max_score = max(max_score, sum(placed[i:i+K+1]))

print(max_score)
