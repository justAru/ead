package proxyProject;

public class ProxyBank implements Bank {
    private String pin;
    private realBank realBank;

    public ProxyBank(String pin) {
        this.pin = pin;
    }

    @Override
    public void check() {
        if (realBank == null){
            realBank = new realBank(pin);
        }
        realBank.check();
    }
}
