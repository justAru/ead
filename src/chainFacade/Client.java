package chainFacade;

import chainFacade.processes.*;

public class Client {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.startProcess();
    }
}
