# here we have to find the maximum sum of subset without the 
# adjecent element

def solve(l):
    dp = [0 for i in range(len(l))]

    dp[0] ,dp[1] = l[0],l[1]   # 7 10 0 0 0 0

    for i in range(2,len(dp)):
        dp[i] = max(dp[i-1] , dp[i-2] + l[i] )

    # ans will be the dp[len(dp)-1]
    print("dp is : ", dp)
    return dp[len(dp)-1]

l = [7,10,12,7,9,14]
print(solve(l))
