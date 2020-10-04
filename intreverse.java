// revrsing the integer
public class intreverse {
  public static void main(String[] args) {
    int n = 12345;
    int t = 0;
    while (n > 0) {
      int r = n % 10;
      t = t * 10 + r;
      n = n / 10;
    }
    System.out.println(t);
  }
}
