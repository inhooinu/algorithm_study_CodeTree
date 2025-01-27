n, k, T = input().split()
n = int(n)
k = int(k)

words = []

for _ in range(n):
    word = input()
    start_w = word[:len(T)]

    if start_w == T:
        words.append(word)

words = sorted(words)
print(words[k-1])