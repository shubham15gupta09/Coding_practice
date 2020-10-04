public class inheritanceExample {
    static class A {
        static int a;
        int b;
        A(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) {
        A obj = new A(1,2);
        System.out.println(A.a) ;
    }
}