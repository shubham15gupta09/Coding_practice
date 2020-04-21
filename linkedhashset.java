import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {

        LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
        // complexity is higher than the hashset as it has to maintain the order of the
        // element in which they are inserted
        // f the order is not necessary use the hash set
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