public class Main {
    public static void main(String[] args) {

        // Child classes, Circle, Rectangle can be substituted for parent class Shape
        Shape circle = new Circle(15);
        Shape rectangle = new Rectangle(12, 15);
        Shape square = new Square(31);

        circle.calculateArea();
        rectangle.calculateArea();
        square.calculateArea();

        // Child class Square can be substituted for parent class Rectangle
        Rectangle rect1 = new Rectangle(11, 10);
        Rectangle rect2 = new Square(11);

        rect1.calculateArea();
        rect2.calculateArea();
    }
}
