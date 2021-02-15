package CurrencyChangeSubscription;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface Observer {
    public void update(Observed observed);
    public void handleEvent(List<Double> rates);
}
