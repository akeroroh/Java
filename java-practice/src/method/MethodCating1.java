package method;

public class MethodCating1 {
    static void main(String[] args) {
        double number = 1.5;
//        printNumber(nunmber);
        printNumber((int) number);
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
