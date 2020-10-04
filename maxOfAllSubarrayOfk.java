public class maxOfAllSubarrayOfk {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        int n = a.length;
        int max = a[0];
        for (int i = 1; i < k; i++) {
            if (max < a[i])
                max = a[i];
        }
        System.out.print(max + " ");
        for (int i = k; i < n; i++) {
            if (max < a[i])
                max = a[i];
            System.out.print(max + " ");
        }
    }
}