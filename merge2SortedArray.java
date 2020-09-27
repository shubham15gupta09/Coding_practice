import java.util.Arrays;

public class merge2SortedArray {
  public static void main(String[] args) {
    int[] a = new int[] { 2, 4, 6 };
    int[] b = new int[] { 1, 3, 5 };
    int[] res = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    int n1 = a.length;
    int n2 = b.length;
    while (i < n1 && j < n2) {
      if (b[i] < b[j])
        res[k++] = a[i++];
      else
        res[k++] = b[j++];
    }
    while (i < n1)
      res[k++] = a[i++];
    while (j < n2)
      res[k++] = b[j++];
    System.out.println(Arrays.toString(res));
  }
}