package CurrencyChangeSubscription;

import java.time.LocalDateTime;
import java.util.List;

public class Logger implements Observer{
    String name;

    public Logger(String name) {
        this.name = name;
    }

    @Override
    public void update(Observed observed) {
        System.out.println("Logger of currency changes: ");
        if (observed instanceof NationalBank) {
            NationalBank bnk = ((NationalBank) observed);
            int i = bnk.rates.size();
            System.out.println("The Rate of $ has been changed from " + bnk.rates.get(i - 2) + " to " + bnk.rates.get(i - 1) + " on " + LocalDateTime.now() + "\n");
        }
    }

    @Override
    public void handleEvent(List<Double> rates) {
        System.out.println("Dear " + name + "\nWe have some exchange in rates: " + rates + "\n");
    }
}
