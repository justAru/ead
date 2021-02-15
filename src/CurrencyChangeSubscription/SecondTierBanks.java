package CurrencyChangeSubscription;

import java.util.List;

public class SecondTierBanks implements Observer{
    String name;

    public SecondTierBanks(String name) {
        this.name = name;
    }

    @Override
    public void update(Observed observed) {
        System.out.println("Second-tier Bank rate: ");
        if (observed instanceof NationalBank) {
            NationalBank bnk = ((NationalBank) observed);
            Double buy = bnk.getPrice() + 1.0;
            Double sale = bnk.getPrice() + 2.0;
            System.out.println("Buy : " + buy + "\n" + "Sale : " + sale + "\n" + "=================================" +
                    "===========================" + "\n");
        }
    }

    @Override
    public void handleEvent(List<Double> rates) {
        System.out.println("Dear " + name + "\nWe have some exchange in rates: " + rates + "\n");
    }
}
