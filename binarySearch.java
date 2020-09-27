// binary search
public record binarySearch() {
  static boolean search(int l, int r, int[] a, int k) {
    int mid = r + (l - r / 2);
    if (mid == k)
      return true;
    while (l < r) {
      if (mid > k)
        return search(0, mid - 1, a, k);
      if (mid < k)
        return search(mid + 1, a.length, a, k);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(search(0, a.length, a, 5));
  }
}