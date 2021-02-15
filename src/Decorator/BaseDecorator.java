package Decorator;

public class BaseDecorator implements Notifier {

    Notifier wrappee;

    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String sendMsg() {
        return wrappee.sendMsg();
    }
}
