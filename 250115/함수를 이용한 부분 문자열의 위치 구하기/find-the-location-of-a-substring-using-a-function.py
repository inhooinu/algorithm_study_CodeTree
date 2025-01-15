text = input()
pattern = input()

# Write your code here!
if pattern in text:
    print(text.index(pattern))
else:
    print(-1)