package stateExample;

public class Off implements IPossibleStates {

    //изначально телик выключен
    public Off() {
        System.out.println("TV is Off now.");
    }

    //Юзер может нажать любую из этих кнопок On, Off или Mute

    //TV выключен, юзер нажимает On
    @Override
    public void PressOnButton(TV context) {
        System.out.println("You pressed On button. Going from Off to On state");
        context.setCurrentState(new On());
    }

    //TV выключен, юзер нажимает Off снова
    @Override
    public void PressOffButton(TV context) {

        System.out.println("You pressed Off button. TV is already in Off state");
    }

    //TV выключен, юзер нажимает Mute
    @Override
    public void PressMuteButton(TV context) {
        System.out.println("You pressed Mute button. TV is already in Off state, " +
                "so Mute operation will not work.");
    }
}
