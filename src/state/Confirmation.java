package state;

public class Confirmation implements Activity{
    public Confirmation(){
        System.out.println("Confirmation mode: ");
    }
    @Override
    public void makeOrder(Customer customer) {
        System.out.println("Order is confirming...");
    }

    @Override
    public void addProduct(Customer customer) {
        if (customer.activity instanceof Confirmation){
            System.out.println("======move to order mode=======");
            customer.setActivity(new Order());
            customer.addToBusket();
            customer.changeActivity();
        }else {
            System.out.println("Error");
        }
    }
}
