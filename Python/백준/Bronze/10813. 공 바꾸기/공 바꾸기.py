n, m = map(int, input().split())
arr = [0] * n

for i in range(n):
    arr[i] = i + 1
    
for i in range(m):
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    val = 0
    val = arr[b]
    arr[b] = arr[a]
    arr[a] = val
    
for i in range(n):
    print(arr[i], end = ' ')