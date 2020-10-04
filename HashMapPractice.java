import java.util.*;

public class HashMapPractice{
    public static void main(String[] args) {
        HashMap<Character , Integer> hm = new HashMap<>();
        hm.put('a',1);
        hm.put('b',2);
        hm.put('c',3);
        hm.put('d',4);
        System.out.println(hm);
        for( Character s:hm.keySet())
        System.out.println(s + " "+ hm.get(s));
    }
}