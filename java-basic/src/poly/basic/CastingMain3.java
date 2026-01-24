package poly.basic;

public class CastingMain3 {
    static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 (Parent) 생략 가능, 생략 권장
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
