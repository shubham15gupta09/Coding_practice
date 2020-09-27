// reverse array
import java.util.Arrays;

public class reverseArray {
  public static void main(String[] args) {
    int[] a = new int[] { 9, 6, 2, 4, 3, 6, 7, 7, 5, 3 };
    int t = 0;
    for (int i = 0, j = a.length - 1; i < j; i++, j--) {
      t = a[i];
      a[i] = a[j];
      a[j] = t;
    }
    System.out.println(Arrays.toString(a));
  }
}
