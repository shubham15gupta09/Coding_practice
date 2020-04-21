import java.util.*; 

public class arraylist{
    public static void main(String[] args) {
        LinkedList<Integer> arrli = new LinkedList<Integer>(); 
        for (int i=1; i<=10; i++) 
            arrli.add(i); 
        System.out.println(arrli); 
        arrli.add(2,10);
        System.out.println(arrli); 
        arrli.add(5);
        System.out.println(arrli); 
        arrli.remove(5);
        System.out.println(arrli); 
        arrli.set(3,5);
        System.out.println(arrli); 
        System.out.println(arrli.lastIndexOf(10));
        System.out.println(arrli.indexOf(10));
        System.out.println(arrli.contains(5));
    }
} 