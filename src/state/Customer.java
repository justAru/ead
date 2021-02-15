package state;

public class Customer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Order){
            setActivity(new Confirmation());
        } else if (activity instanceof Confirmation){
            setActivity(new Invoice());
        } else if (activity instanceof Invoice){
            setActivity(new Shipped());
        } else if (activity instanceof Shipped){
            setActivity(new Cancel());
        } else if (activity instanceof Cancel){
            setActivity(new Order());
        }
    }

    public void justDoIt(){
        activity.makeOrder(this);
    }

    public void addToBusket(){
        activity.addProduct(this);
    }
}
