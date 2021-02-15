package chainFacade.processes;

import chainFacade.Notifier;

public class DocSubmission extends Notifier {
    public DocSubmission(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Documents submission process..." + msg);
    }
}
