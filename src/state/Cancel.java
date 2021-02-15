package state;

public class Cancel implements Activity {
    public Cancel(){
        System.out.println("Cancel mode: ");
    }
    @Override
    public void makeOrder(Customer customer) {
        System.out.println("Order is cancelled...");
    }

    @Override
    public void addProduct(Customer customer) {
        if (customer.activity instanceof Cancel){
            System.out.println("You can't add product in Cancel mode...");
        } else {
            System.out.println("Error in cancel mode...");
        }
    }
}
