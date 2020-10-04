// reversing an array
import java.util.*;
import java.io.*;
class ArrayReverse {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array ");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter element of array ");
        for( int i = 0 ; i < n ; i++) {
            a[i] = in.nextInt();
        }
        int temp;
        int low=0,high=n-1;
        while(low < high) {
            temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        System.out.println("reversed array is ");
        for( int i = 0 ; i < n ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}