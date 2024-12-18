public class Square extends Rectangle {

    private double side;

    public Square()
    {

    }

    public Square(double s)
    {
        side = s;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double s)
    {
        side = s;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("Area of square is: " + (side * side));
    }
}
