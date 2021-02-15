package chainFacade.processes;

import chainFacade.Notifier;

public class Interview extends Notifier {
    public Interview(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Interview process..." + msg);
    }
}
