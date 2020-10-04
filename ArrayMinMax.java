import java.util.*;
import java.io.*;
class ArrayMinMax { 
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter element of array");
        for( int i = 0 ; i < n ; i++) {
            a[i] = in.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for( int i = 0 ; i < n ;i++) {
            if ( min > a[i])
                min = a[i];
            if ( max < a[i])
                max = a[i];
        }       
        System.out.println("max element "+ max+"\n"+"min element "+min);
    }
}