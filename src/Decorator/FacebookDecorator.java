package Decorator;

public class FacebookDecorator extends BaseDecorator{
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    public String FcbNotify(){
        return "Facebook notification sending...";
    }

    @Override
    public String sendMsg() {
        return super.sendMsg() + FcbNotify();
    }
}
