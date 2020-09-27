public class nPrimeNo {
  static boolean checkprime(int n) {
    for (int i = 2; i <= n / 2; i++)
      if (n % i == 0)
        return false;
    return true;
  }

  public static void main(String[] args) {
    int k = 1;
    int counter = 0;
    while (counter < 10) {
      if (checkprime(k)) {
        System.out.print(k + " ");
        counter++;
      }
      k++;
    }
  }
}