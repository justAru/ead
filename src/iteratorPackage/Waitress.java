package iteratorPackage;

import java.util.ArrayList;

public class Waitress {
    ArrayList<Iterator> menus;

    public Waitress(ArrayList<Iterator> menus){
        this.menus = menus;
    }
    public void printMenu(){

        for(int i = 0; i < menus.size(); i++){
            printMenu(menus.get(i));
        }
    }

    void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
