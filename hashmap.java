import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] a= new int[]{1,2,3,-2,-4,5,6,-2};
        for( int x:a){
            map.put(x,0);
        }
        int k=100;
        for ( int i=0;i<a.length;i++){
                if( map.containsKey(i-k)){
                    System.out.println("yes");
                    break;
                }else{
                    System.out.println("mo");                    
                }
        }
    }
}