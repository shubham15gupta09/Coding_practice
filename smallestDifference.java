import java.util.Arrays;

public class smallestDifference {
    public static void main(String[] args) {
        int[] a = new int[] { -1, 5, 10, 20, 28, 3 };
        int[] b = new int[] { 26, 134, 135, 15, 17 };
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        int min = 65536;
        int temp;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp = b[j] - a[i];
                i++;
            } else if (a[i] > b[j]) {
                temp = a[i] - b[j];
                j++;
            } else {
                temp = 0;
                min = temp;
                break;
            }
            if (min > temp)
                min = temp;
        }
        System.out.println(min);
    }
}