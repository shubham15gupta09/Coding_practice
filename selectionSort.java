// selection sort
public class selectionSort {
  public static void main(String[] args) {
    int temp = 0;
    int[] a = new int[] { 9, 6, 2, 4, 3, 6, 7, 7, 5, 3 };
    int min = 0;
    for (int i = 0; i < a.length; i++) {
      min = a[i];
      for (int j = i + 1; j < a.length; j++) {
        if (min > a[j]) {
          temp = a[j];
          a[j] = min;
          min = temp;
        }
      }
      a[i] = min;
    }
    for (int i = 0; i < a.length - 1; i++) {
      System.out.print(a[i] + " ");
    }
  }
}