public class countNoOfHoops {
    public static void main(String[] args) {
        int n = 15;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(dp[n]);
        for (int x : dp)
            System.out.print(x + " ");
    }
}