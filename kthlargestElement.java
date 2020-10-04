// kth largets element 
import java.util.PriorityQueue;

public class kthlargestElement {
  public static void main(String[] args) {
    int[] a = new int[] { 7, 10, 4, 3, 20, 15 }; // 3,4,7,10,15,20
    int k = 3;
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
    // min heap
    for (int i = 0; i < a.length; i++) {
      pq.add(a[i]);
      if (pq.size() > k) {
        pq.poll();
      }
    }
    System.out.println(pq.peek());
  }
}