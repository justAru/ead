package state;

public class Shipped implements Activity{
    public Shipped(){
        System.out.println("Shipped mode: ");
    }
    @Override
    public void makeOrder(Customer customer) {
        System.out.println("Product preparing to ship...");
    }

    @Override
    public void addProduct(Customer customer) {
        if (customer.activity instanceof Shipped){
            System.out.println("You can't add product in Shipped mode...");
        } else {
            System.out.println("Error in shipped mode...");
        }
    }
}
