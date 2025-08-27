def perfect(A, B):
    cnt = 0

    for num in range(A, B+1):
        if num%2==0:
            continue
        if num%10==5:
            continue
        if num%3==0 and num%9!=0:
            continue
        
        cnt += 1
    
    return cnt

A, B = map(int, input().split())
print(perfect(A, B))