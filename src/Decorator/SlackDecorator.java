package Decorator;

public class SlackDecorator extends BaseDecorator{
    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    public String SlackMotify(){
        return "Slack notification sending...";
    }

    @Override
    public String sendMsg() {
        return super.sendMsg() + SlackMotify();
    }
}
