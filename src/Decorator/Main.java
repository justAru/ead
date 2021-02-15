package Decorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new SMSDecorator(new ConcreteNotifier());
        System.out.println(notifier.sendMsg() + "\n");

        Notifier anotherSender = new SMSDecorator(new FacebookDecorator(new ConcreteNotifier()));
        System.out.println(anotherSender.sendMsg() + "\n");

        Notifier anotherSender2 = new SlackDecorator(new SMSDecorator(new FacebookDecorator(new ConcreteNotifier())));
        System.out.println(anotherSender2.sendMsg() + "\n");

    }
}
