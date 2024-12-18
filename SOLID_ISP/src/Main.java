import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void displayMenu(List<String> menu)
    {
        for(int i=0;i<menu.size();i++)
        {
            System.out.println(menu.get(i));
        }
    }
    public static void main(String[] args) {

        List<String> menu = new ArrayList<>();
        IVegetarian veg = new Vegetarian();
        menu = veg.getVegetarianMenu();

        System.out.println("**********Veg menu is delicious!!!**********");
        displayMenu(menu);

        INonvegetarian nonVeg = new Nonvegetarian();
        menu = nonVeg.getNonvegetarianMenu();

        System.out.println("**********NonVeg menu is finger licking good!!!**********");
        displayMenu(menu);

        IDrink drinks = new Drinks();
        menu = drinks.getDrinksMenu();

        System.out.println("**********Drinks are head spinning!!!**********");
        displayMenu(menu);

    }
}
