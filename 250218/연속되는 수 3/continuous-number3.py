N = int(input())
nums = [int(input()) for _ in range(N)]

max_cnt = 0
cnt = 0
for i in range(N):
    if i >= 1 and ((nums[i] < 0 and nums[i-1] < 0) or (nums[i] > 0 and nums[i-1] > 0)):
        cnt += 1
        if max_cnt < cnt:
            max_cnt = cnt
    else:
        cnt = 1

print(max_cnt)