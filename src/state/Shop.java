package state;

public class Shop {
    public static void main(String[] args) {
        Activity activity = new Order();
        Customer customer = new Customer();

        customer.setActivity(activity);

        customer.justDoIt(); //order mode
        customer.addToBusket();

        customer.changeActivity();

        customer.justDoIt(); //making confirm
        customer.addToBusket(); // add to basket throw to move to order mode

        customer.changeActivity();

        customer.justDoIt(); //invoice mode
        customer.addToBusket();

        customer.changeActivity();

        customer.justDoIt(); // shipping mode
        customer.addToBusket();

        customer.changeActivity();

        customer.justDoIt(); //cancel mode
        customer.addToBusket();
    }
}
