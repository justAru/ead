package stateExample;

public class Mute implements IPossibleStates{
    public Mute() {

        System.out.println("TV is in Mute mode now");
    }
    //Юзер может нажать любую из этих кнопок On, Off или Mute

    //TV без звука, юзер нажимает On
    @Override
    public void PressOnButton(TV context) {
        System.out.println("You pressed On button. Going from Mute mode to On state.");
        context.setCurrentState(new On());
    }
    //TV без звука, юзер нажимает Off
    @Override
    public void PressOffButton(TV context) {
        System.out.println("You pressed Off button. Going from Mute mode to Off state.");
        context.setCurrentState(new Off());
    }

    //TV без звука, юзер нажимает mute снова
    @Override
    public void PressMuteButton(TV context) {
        System.out.println("You pressed Mute button. TV is already in Mute mode.");
    }
}
