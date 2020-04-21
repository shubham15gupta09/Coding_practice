import java.util.*;
public class ksumsubarray {
    public static void main(String[] args) {
        int[] a = new int[]{ 1 , -2 , 3 , -1 , -4 , 5 , 6 , -1 , -2 , 7 };
        int k =5;
        int sum = 2;
        Set <Integer> s = new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            sum +=a[i];
            if (s.contains(sum-k)){
                System.out.println("true");
                break;
            } else{
                s.add(sum);
            }
        }
    }
}