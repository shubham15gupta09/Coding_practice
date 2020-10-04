import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class NGR {

  public static void main(String[] args) {
    int arr[] = { 4, 5, 2, 10, 8 };
    int n = arr.length;
    nearestElementGreaterToRight(arr, n);
  }
  
  static void nearestElementGreaterToRight(int arr[], int n) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    Stack<Integer> S = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      while (!S.empty() && S.peek() <= arr[i]) {
        S.pop();
      }
      if (S.empty()) {
        al.add(-1);
      } else {
        al.add(S.peek());
      }
      S.push(arr[i]);
    }
    Collections.reverse(al);
    System.out.println(al);
  }
}
