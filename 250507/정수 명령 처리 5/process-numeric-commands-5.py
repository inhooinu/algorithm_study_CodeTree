nums = []

N = int(input())
for _ in range(N):
    command = list(input().split())
    
    if command[0] == "push_back":
        nums.append(command[1])

    elif command[0] == "pop_back":
        nums.pop()
    
    elif command[0] == "size":
        print(len(nums))

    elif command[0] == "get":
        print(nums[int(command[1])-1])