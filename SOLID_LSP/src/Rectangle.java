public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle()
    {

    }

    public Rectangle(double h, double w)
    {
        height = h;
        width = w;
    }
    public double getHeight()
    {
        return height;
    }


    public double getWidth()
    {
        return width;
    }

    public void setHeight(double h)
    {
        height = h;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("Area of rectangle is: " + ( 2 * (height + width)));
    }

}
