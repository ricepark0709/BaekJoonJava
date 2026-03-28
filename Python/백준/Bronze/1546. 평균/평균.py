n = int(input())
arr = list(map(int, input().split()))

max_val = max(arr)

total_sum = 0
for score in arr:
    total_sum += score / max_val * 100

print(total_sum / n)