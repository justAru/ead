package stateExample;

public class TV {
    private IPossibleStates currentState;

    public TV(IPossibleStates currentState)
    {
        this.currentState = currentState;
    }

    public IPossibleStates getCurrentState() {

        return currentState;
    }

    public void setCurrentState(IPossibleStates currentState) {

        this.currentState = currentState;
    }

    public void PressOffButton()
    {
        currentState.PressOffButton(this); //Delegating the state
    }
    public void PressOnButton()
    {
        currentState.PressOnButton(this); //Delegating the state
    }
    public void PressMuteButton()
    {
        currentState.PressMuteButton(this);//Delegating the state
    }
}
