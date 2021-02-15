package Decorator;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    public String SMsNotify(){
        return "Sms Notification sending...";
    }

    @Override
    public String sendMsg() {
        return super.sendMsg() + SMsNotify();
    }
}
