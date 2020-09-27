// Anagram check
import java.util.Arrays;

class Anagram {
  public static void main(String args[]) {
    String s1 = "hippo";
    String s2 = "hipop";
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    for (int i = 0; i < c1.length; i++) {
      if (c1[i] == c2[i]) {
        System.out.println("an Anagram");
      } else
        System.out.println("Not an Anagram");
    }
  }
}