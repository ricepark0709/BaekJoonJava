arr = [False] * 30

for i in range(28):
    s = int(input())
    s -= 1
    arr[s] = True
    
for i in range(30):
    if arr[i] == False:
        print(i + 1)