public class LevenshteinDistance {
    public static void main(String[] args) {
        char[] s1 = new char[] { 'a', 'b', 'c' };
        char[] s2 = new char[] { 'y', 'a', 'b', 'd' };
        int n = s1.length;
        int m = s2.length;
        int min = 0;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < m + 1; i++)
            dp[0][i] = i;
        for (int i = 0; i < n + 1; i++)
            dp[i][0] = i;
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j <= m + 1; j++) {
                if (s1[i-1] == s2[j-2])
                    dp[i][j] = dp[i - 1][j - 1];
                else {
                    int a = dp[i][j - 1];
                    int b = dp[i - 1][j];
                    int c = dp[i - 1][j - 1];
                    if (a < b && a < c)
                        min = a;
                    if (b < c && b < a)
                        min = b;
                    if (c < a && c < b)
                        min = c;
                    dp[i][j] = min + 1;
                }
            }
        }
    }
}