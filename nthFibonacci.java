// nth fibvonacci
public class nthFibonacci {

  static int fibn(int n) {
    if (n <= 1)
      return n;
    else {
      int[] mm = new int[n + 1];
      mm[0] = 0;
      mm[1] = 1;
      for (int i = 2; i <= n; i++) {
        mm[i] = mm[i - 1] + mm[i - 2];
      }
      return mm[n - 1];
    }
  }

  public static void main(String[] args) {
    int n = 5; // 0 1 1 2 3 5
    System.out.println(fibn(n));
  }
}