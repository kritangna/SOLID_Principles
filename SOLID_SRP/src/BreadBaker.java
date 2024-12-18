public class BreadBaker {

    private String bakeryName;

    public BreadBaker()
    {

    }

    public String getName()
    {
        return bakeryName;
    }

    public void setName(String name)
    {
        bakeryName = name;
    }

    public void bakeBread()
    {
        System.out.println("Hi! Welcome to " + bakeryName + " Let's bake the bread");
    }

}
