n = int(input())
p , s = [] , []
for i in range(n):
    p.append(input())
for i in range(n):
    s.append(input())
maps={}
for i in range(n):
    maps[p[i]] = s[i]

p.sort()

for i in range(n):
    x = maps[p[i]]
    if int(n/2) == i:
        print(x)
    elif i === len(x):
        print(x.upper())
    else:
        print(x.lower())