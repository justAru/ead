package chainFacade.processes;

import chainFacade.Notifier;

public class Kazakh extends Notifier {
    public Kazakh(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Kazakh test..." + msg);
    }
}
