n, m = map(int, input().split())
arr = [0] * n
for i in range(n):
    arr[i] = i + 1

for i in range(m):
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    while a < b:
        arr[a], arr[b] = arr[b], arr[a]
        a += 1
        b -= 1

for i in range(n):
    print(arr[i], end=' ')