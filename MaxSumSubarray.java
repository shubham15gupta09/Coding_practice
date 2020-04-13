import java.util.*;
import java.io.*;
class MaxSumSubarray {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}
	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int msf = Integer.MIN_VALUE;
		int meh = 0;
		for (int i = 0; i < size; i++) {
			meh += a[i];
			if (msf < meh)
				msf = meh;
			if (meh < 0)
				meh = 0;
		}
		return msf;
	}
}