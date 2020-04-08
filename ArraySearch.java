//linear search
import java.util.*;
import java.*;
class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements of array");
        for ( int i = 0 ; i < n ; i++) { 
            a[i] = in.nextInt();
        }
        int key;
        System.out.println("enter the element to be searched in array");
        key = in.nextInt();
        for(int i = 0 ; i < n ; i++) {
            if ( a[i] == key) {
                System.out.println("element found at "+(i+1)+" position");
            }
        }
    }
}