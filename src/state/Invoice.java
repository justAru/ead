package state;

public class Invoice implements Activity {
    public Invoice(){
        System.out.println("Invoice mode: ");
    }
    @Override
    public void makeOrder(Customer customer) {
        System.out.println("Bill preparation...");
    }

    @Override
    public void addProduct(Customer customer) {
        if (customer.activity instanceof Invoice){
            System.out.println("You can't add product in Invoice mode...");
        } else {
            System.out.println("Error in invoice mode...");
        }
    }
}
