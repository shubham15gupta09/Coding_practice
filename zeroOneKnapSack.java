// 0 1 knapsack dp problem

public class zeroOneKnapSack {
  static int[][] dp = new int[10][10];

  static void init_dp() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        dp[i][j] = -1;
      }
    }
  }

  static int knapsack(int[] weight, int[] value, int wt, int n) {
    if (n == 0 || wt == 0) {
      return 0;
    } else if (weight[n - 1] <= wt) {
      return dp[n][wt] = Math.max(value[n - 1] + knapsack(weight, value, wt - weight[n - 1], n - 1),
          knapsack(weight, value, wt, n - 1));
    } else
      return dp[n][wt] = knapsack(weight, value, wt, n - 1);
  }

  public static void main(String[] args) {
    init_dp();
    int[] weight = new int[] { 1, 3, 4, 5, 5, 2, 4 };
    int[] value = new int[] { 2, 4, 5, 7, 1, 4, 1 };
    int wt = 7;
    System.out.println(knapsack(weight, value, wt, value.length));
  }
}