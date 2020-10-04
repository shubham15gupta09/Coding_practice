import java.util.*;
import java.io.*;
class Arrayio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        int[] a = new int[n];
        for( int i = 0 ; i < n ; i++) {
            a[i] = in.nextInt();
        }
        for( int i = 0 ; i < n ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}