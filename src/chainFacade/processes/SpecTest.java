package chainFacade.processes;

import chainFacade.Notifier;

public class SpecTest extends Notifier {
    public SpecTest(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Specialization test process..." + msg);
    }
}
