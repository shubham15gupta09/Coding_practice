public class moveElementToEnd {
    public static void main(String[] args) {
        int[] a = new int[] { 9, 6, 2, 4, 3, 2, 2, 2, 7, 2, 8, 4, 0, 1 };
        int k = 4;
        int i = 0, j = a.length - 1, temp = 0;
        while (i < j) {
            if (a[j] == k) {
                j--;
            } else {
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }
        for (int x : a)
            System.out.print(x);
    }
}