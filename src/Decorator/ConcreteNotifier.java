package Decorator;

public class ConcreteNotifier implements Notifier {
    @Override
    public String sendMsg() {
        return "Message created...\n";
    }
}
