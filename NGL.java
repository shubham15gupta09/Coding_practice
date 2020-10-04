import java.util.Stack;
// nearest greater to the left
class NGL {
  static void nearestElementGreaterToLeft(int arr[], int n) {
    Stack<Integer> S = new Stack<>();
    for (int i = 0; i < n; i++) {
      while (!S.empty() && S.peek() <= arr[i]) {
        S.pop();
      }
      if (S.empty()) {
        System.out.print("-1, ");
      } else {
        System.out.print(S.peek() + ", ");
      }
      S.push(arr[i]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 2, 10, 8 };
    int n = arr.length;
    nearestElementGreaterToLeft(arr, n);
  }
}