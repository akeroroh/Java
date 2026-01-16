package oop1.ex;

public class RectangleOopMain {
    static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean square = rectangle.isSquare();

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + perimeter);
        System.out.println("정사각형 여부: " + square);
    }
}
