package iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Iterator> menus = new ArrayList<>();
        PancakeHouseMenu pHMenu = new PancakeHouseMenu();
        Iterator fisrt = pHMenu.getIterator();
        DinerMenu dMenu = new DinerMenu();
        Iterator second = dMenu.getIterator();

        menus.add(fisrt);
        menus.add(second);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();

    }
}
