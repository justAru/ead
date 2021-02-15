package CurrencyChangeSubscription;

import java.util.*;

public class NationalBank implements Observed {
    List<Double> rates = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();
    private Double price;

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.rates);
            observer.update(this);
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
        this.rates.add(price);
        notifyObservers();
    }
}
