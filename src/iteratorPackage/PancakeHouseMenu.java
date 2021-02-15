package iteratorPackage;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    @Override
    public Iterator getIterator() {
        return new PancakeHouseMenuIterator();
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public PancakeHouseMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    private class PancakeHouseMenuIterator implements Iterator{
        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < menuItems.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return menuItems.get(index++);
        }
    }
}
