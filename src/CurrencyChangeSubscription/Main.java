package CurrencyChangeSubscription;

public class Main {
    public static void main(String[] args) {
        NationalBank NationalBank = new NationalBank();

        NationalBank.setPrice(420.0);
        NationalBank.setPrice(421.0);

        Observer mig = new ExchangeOffices("MIG");
        NationalBank.addObserver(mig);

        Observer bank = new SecondTierBanks("KaspiBank");
        NationalBank.addObserver(bank);

        Observer mgz = new Logger("Financial journal");
        NationalBank.addObserver(mgz);

        NationalBank.setPrice(426.0);
    }
}
