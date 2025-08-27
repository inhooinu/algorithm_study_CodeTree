def is_prime(num):
    for i in range(2, num):
        if num%i == 0:
            return False
    return True

def count(A, B):
    # 소수이면서
    # 모든 자릿수의 합이 짝수인 수의 개수
    # 1~100
    cnt = 0

    for num in range(A, B+1):
        # 소수가 아니면 다음 숫자로 넘어감
        if not is_prime(num):
            continue
        
        if (num//10 + num%10)%2 == 0:
            cnt += 1
    
    return cnt

A, B = map(int, input().split())
print(count(A, B))
