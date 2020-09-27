// first duplicate
public class findDuplicate {
  public static void main(String[] args) {
    int[] a = new int[] { 1, 2, 3, 4, 5, 4};
    int ans = 1;
    for (int i = 0; i < a.length; i++) {
      ans = ans ^ a[i];
    }
    System.out.println(ans);
  }
}