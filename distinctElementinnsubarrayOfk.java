import java.util.HashMap;

public class distinctElementinnsubarrayOfk {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k; i++) 
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        System.out.print(hm.size()+" ");
        for (int i = k; i < a.length; i++) { 
            if (hm.get(a[i - k]) == 1) 
                hm.remove(a[i - k]); 
            else
                hm.put(a[i - k],  hm.get(a[i - k]) - 1);             
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1); 
            System.out.print(hm.size()+" "); 
        } 
    }
}