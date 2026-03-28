a, b, c = map(int, input().split())
prize = 0

if a == b and b == c and c == a:
    prize = 10000 + a * 1000
elif a == b or b == c or c == a:
    if a == b:
        prize = 1000 + a * 100
    elif b == c:
        prize = 1000 + b * 100
    else:
        prize = 1000 + c * 100
else:
    if a > b and a > c:
        prize = a * 100
    elif b > a and b > c:
        prize = b * 100
    elif c > a and c > b:
        prize = c * 100
    else:
        prize = a * 100
        
print(prize)