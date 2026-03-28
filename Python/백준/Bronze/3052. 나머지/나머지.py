arr = [0] * 10
count = 10

for i in range(10):
    num = int(input())
    arr[i] = num%42
    
for i in range(10):
    for j in range(i+1, 10, 1):
        if (arr[i] == arr[j]):
            count -= 1
            break
    
print(count)