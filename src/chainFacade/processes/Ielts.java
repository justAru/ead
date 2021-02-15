package chainFacade.processes;

import chainFacade.Notifier;

public class Ielts extends Notifier {
    public Ielts(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("English test..." + msg);
    }
}
