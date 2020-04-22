import java.util.*;

public class freqdist {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] a= new int[]{1,2,3,4,1,2,3,4};

        for(int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
/*
        for( int x:a){
            if(!map.containsKey(x))
                map.put(x,1);
             else{
                map.replace(x , map.get(x)+1);
            }
        }
        map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v)); */
                System.out.println(map);
    }
}