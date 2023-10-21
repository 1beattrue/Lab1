package tmp;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(2);

        System.out.println(circle.getArea());
        System.out.println(square.getArea());
    }
}
