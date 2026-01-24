package poly.basic;

public class CastingMain2 {
    static void main(String[] args) {
        Parent poly = new Child();
        ((Child) poly).childMethod();
    }
}
