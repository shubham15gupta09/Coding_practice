// pair sum
import java.util.HashMap;

public class pairSumK {
  public static void main(String[] args) {
    int[] a = new int[] { 9, 6, 2, 7, 3, 6, 5 };
    int k = 5;
    int found = 1;
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for (int i = 0; i < a.length; i++) {
      int y = k - a[i];
      if (hm.containsKey(y)) {
        System.out.println(a[i] + " " + hm.get(y));
        found = 0;
      }
      hm.put(a[i], i);
    }
    if (found == 1)
      System.out.println("Not Found");
  }
}