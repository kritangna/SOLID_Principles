public class Circle extends Shape{

    private double radius;
    private Shape shape;
    private final double pi = 3.14;
    public Circle()
    {

    }

    public Circle(double r)
    {
        this.radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(int r)
    {
        radius = r;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("Area of circle is: " + ( pi * radius * radius));
    }
}
