/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	 int t , n , sum = 0 , sum_n = 0 ;
	 Scanner in = new Scanner(System.in);
     t = in.nextInt();
     int[] ans = new int[t]; 
	 while(t > 0) {
	     n = in.nextInt();
	     sum_n = ((n*(n+1))/2);
	     int x;
	     for(int i = 0 ; i < n-1 ; i++) {
	         x = in.nextInt();
	         sum = sum + x;
	     }
	     ans[t]= sum_n-sum;
	     t=t-1;
     }
     for( int i=t;i>0;i--) {
         System.out.println(ans[i]);
     }
	}
}