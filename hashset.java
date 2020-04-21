import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet <Integer> h = new HashSet<Integer>(); 
        // O(1) complexity for the addition and deletion and even for finding 
        // element in the data structure 
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        System.out.println(h);
        h.add(4);
        System.out.println(h);
        h.remove(3);
        System.out.println(h);
        h.contains(3);
        System.out.println(h.size());
        System.out.println(h.isEmpty());
    }
}