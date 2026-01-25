package poly.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐엉");
    }

    @Override
    public void move() {
        System.out.println("나옹이 이동");
    }
}
