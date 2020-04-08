import java.util.*;
import java.util.Arrays;
class Kthlargest{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n , k;
        System.out.println("enter the size of arrayt ");
        n = in.nextInt();
        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = in.nextInt();
        }
        System.out.println("enter the kth element ");
        k = in.nextInt();
        Arrays.sort(a);
        System.out.println(k + "th largest element is "+a[k-1]);
    }
}