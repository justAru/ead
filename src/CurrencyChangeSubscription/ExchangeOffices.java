package CurrencyChangeSubscription;

import java.util.List;

public class ExchangeOffices implements Observer {
    String name;

    public ExchangeOffices(String name) {
        this.name = name;
    }

    @Override
    public void update(Observed observed) {
        System.out.println("Exchange Office rate: ");
        if (observed instanceof NationalBank) {
            NationalBank bnk = ((NationalBank) observed);
            Double buy = bnk.getPrice() + 1.5;
            Double sale = bnk.getPrice() + 2.5;
            System.out.println("Buy : " + buy + "\n" + "Sale : " + sale + "\n" + "==================================" +
                    "========================" + "\n");
        }
    }

    @Override
    public void handleEvent(List<Double> rates) {
        System.out.println("Dear " + name + "\nWe have some exchange in rates: " + rates + "\n");
    }
}
