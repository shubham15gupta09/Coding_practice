// max sum subarray
public class maxSumSubarray {
  static int answer(int a[]) {
    int n = a.length;
    int msf = Integer.MIN_VALUE;
    int meh = 0;
    for (int i = 0; i < n; i++) {
      meh += a[i];
      if (msf < meh)
        msf = meh;
      if (meh < 0)
        meh = 0;
    }
    return msf;
  }

  public static void main(String[] args) {
    int[] a = new int[] { -1, 3, -4, 6, -2, -7 };
    System.out.println(answer(a));
  }
}