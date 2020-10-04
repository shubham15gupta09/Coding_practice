// sotck span problemm

public class stockSpan {
  static void calculateSpan(int A[], int n, int ans[]) {
    ans[0] = 1;
    for (int i = 1; i < n; i++) {
      int counter = 1;
      while ((i - counter) >= 0 && A[i] >= A[i - counter]) {
        counter += ans[i - counter];
      }
      ans[i] = counter;
    }
  }

  public static void main(String[] args) {
    int price[] = { 10, 4, 5, 90, 120, 80 };
    int n = price.length;
    int S[] = new int[n];
    calculateSpan(price, n, S);
    for (int i = 0; i < S.length; i++)
      System.out.print(S[i] + " ");
  }
}