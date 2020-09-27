import java.util.ArrayList;
import java.util.Collections;

public class maxVowelinKSubarray {
    public static void main(String[] args) {
        String s = "aipleaaashub";
        ArrayList<Integer> al = new ArrayList<>();
        char[] c = s.toCharArray();
        int k = 4, vowel = 0;
        for (int i = 0; i < k; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                vowel++;
            }
        al.add(vowel);
        }

        for (int i = k; i < c.length; i++) {
            if (c[i-k] == 'a' || c[i-k] == 'e' || c[i-k] == 'i' || c[i-k] == 'o' || c[i-k] == 'u') {
                vowel--;
            }
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                vowel++;
            }
            al.add(vowel);
        }
        System.out.println(Collections.max(al)); 
    }
}

// [1, 2, 2, 2, 2, 2, 3, 4, 3, 2, 2, 1]
// 4