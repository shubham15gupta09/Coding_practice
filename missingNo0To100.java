// missing no from 1 to n 
public class missingNo0To100 {
  public static void main(String[] args) {
    int[] a = new int[] { 1, 2, 3, 4, 6 };
    int n = 6;
    int sum = 0;
    for (int x : a)
      sum += x;
    int nsum = n * (n + 1) / 2;
    System.out.println(nsum - sum);
  }
}