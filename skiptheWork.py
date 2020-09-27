l = [5 ,6 ,7 ,8, 9 ,10]
n = len(l)
dp = [0] * n
if n == 1:
    print(0)
elif n == 2:
    print(min(l))
else:
    dp[0] = l[0]
    dp[1] = l[1]
    for i in range(2, n):
        dp[i] = l[i] + min(dp[i - 1], dp[i - 2])
    print(dp)
    print( min(dp[n - 1], dp[n - 2]) )