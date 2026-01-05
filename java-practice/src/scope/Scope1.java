package scope;

public class Scope1 {
    static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
//        System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    }
}
