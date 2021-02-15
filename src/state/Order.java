package state;

public class Order implements Activity {
    public Order(){
        System.out.println("Order mode: ");
    }

    @Override
    public void makeOrder(Customer customer) {
        System.out.println("Order created...");
    }

    @Override
    public void addProduct(Customer customer) {
        System.out.println("Adding products...");
    }
}
