import java.util.*;
import java.io.*;
class RevArray {
    public static void main(String args[]) {
        int n=9;
        int[] a = new int[n];
                int t,i,j;
        Scanner in = new Scanner(System.in);
        for( i = 0 ; i < n ; i++ ) {
            a[i] = in.nextInt();
        }

        for ( i=0 , j=8 ; i < n/2 ; i++ , j--) {
            t=a[i];
            a[i] = a[j];
            a[j]=t;
        }
        for( i = 0 ; i < n ; i++ ) {
            System.out.println(a[i]);
        }
    }
}