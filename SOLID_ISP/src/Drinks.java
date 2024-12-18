import java.util.ArrayList;
import java.util.List;

public class Drinks implements IDrink{

    private List<String> menu = new ArrayList<>();

    public Drinks()
    {

    }

    @Override
    public List<String> getDrinksMenu()
    {
        menu.add("Sangria");
        menu.add("Lemon Soda");
        menu.add("Butterfruit Shake");
        menu.add("Cosmopoliton");
        return menu;
    }


}
