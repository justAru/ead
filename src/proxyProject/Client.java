package proxyProject;

public class Client {
    public static void main(String[] args) {
        Bank bank = new ProxyBank("1234");
        bank.check();
    }
}
