def has_369(num):
    nums = list(str(num))
    if ('3' in nums or '6' in nums or '9' in nums):
        return True
    else:
        return False

def is_satisfied_num(num):
    if (num%3==0 or has_369(num)):
        return True
    else:
        return False

a, b = map(int, input().split())

# Write your code here!
cnt = 0
for num in range(a, b+1):
    if (is_satisfied_num(num)): cnt+=1

print(cnt)

