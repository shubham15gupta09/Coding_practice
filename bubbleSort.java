// bubble sort 
public class bubbleSort {
  public static void main(String[] args) {
    int temp = 0;
    int[] a = new int[] { 9, 6, 2, 4, 3, 6, 7, 7, 5, 3 };
    for (int i = 0; i < a.length - 2; i++) {
      for (int j = 0; j < a.length - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < a.length - 1; i++) {
      System.out.print(a[i] + " ");
    }
  }
}