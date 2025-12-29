package operator;

public class OperatorAdd2 {
    static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++;
        System.out.println("a = " + a + ", b = " + b);

        ++a;
        System.out.println("a = " + a);;
        a++;
        System.out.println("a = " + a);
    }
}
