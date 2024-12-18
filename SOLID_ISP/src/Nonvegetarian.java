import java.util.ArrayList;
import java.util.List;

public class Nonvegetarian implements INonvegetarian{

    private List<String> menu =  new ArrayList<>();

    public Nonvegetarian()
    {

    }

    @Override
    public List<String> getNonvegetarianMenu()
    {
        menu.add("Chicken Tikka");
        menu.add("Prawns Fry");
        menu.add("Lemon Garlic Fish");
        menu.add("Masala Mutton");
        return menu;
    }
}
