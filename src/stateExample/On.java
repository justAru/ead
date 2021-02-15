package stateExample;

public class On implements IPossibleStates{

    public On() {
        System.out.println("TV is On now.");
        //this.tvContext=context;
    }

    //Юзер может нажать любую из этих кнопок On, Off или Mute

    //TV включен, юзер нажимает On снова
    @Override
    public void PressOnButton(TV context) {

        System.out.println("You pressed On button. TV is already in On state.");
    }

    //TV включен, юзер нажимает Off
    @Override
    public void PressOffButton(TV context) {
        System.out.println("You pressed Off button. Going from On to Off mode.");
        context.setCurrentState(new Off());
    }

    //TV включен, юзер нажимает Mute
    @Override
    public void PressMuteButton(TV context) {
        System.out.println("You pressed Mute button. Going from On to Mute state.");
        context.setCurrentState(new Mute());
    }
}
