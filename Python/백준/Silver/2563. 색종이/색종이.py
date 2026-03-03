array = [[False] * 100 for _ in range(100)]
n = int(input())

for i in range(n):
    w, l = map(int, input().split())
    for i in range(w, w+10):
        for j in range(l, l+10):
            array[i][j] = True
            
count = 0

for i in range(100):
    for j in range(100):
        if array[i][j]:
            count+=1
            
print(count)