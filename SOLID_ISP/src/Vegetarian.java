import java.util.ArrayList;
import java.util.List;

public class Vegetarian implements IVegetarian{

    private List<String> menu = new ArrayList<>();

    @Override
    public List<String> getVegetarianMenu()
    {
        menu.add("Paneer Tikka");
        menu.add("Dal Tadka");
        menu.add("Malai Mushrooms");
        menu.add("Soya Chaap");

        return menu;
    }
}
