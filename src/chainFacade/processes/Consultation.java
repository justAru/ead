package chainFacade.processes;

import chainFacade.Notifier;

public class Consultation extends Notifier {

    public Consultation(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Consultation..." + msg);
    }
}
