package stateExample;

public class StateTest {
    public static void main(String args[]) {
        System.out.println("***State Pattern Demo***");
        //телик изначально выключен
        Off initialState = new Off();
        TV tv = new TV(initialState);
        System.out.println("User is pressing buttons in the following sequence:");
        System.out.println("Off->Mute->On->On->Mute->Mute->Off");
        //TV выключен
        tv.PressOffButton();
        //TV выключен, нажали Mute
        tv.PressMuteButton();
        //включаем
        tv.PressOnButton();
        //TV выключен снова жмем On
        tv.PressOnButton();
        //делаем беззвучным
        tv.PressMuteButton();
        //еще раз жмем Mute
        tv.PressMuteButton();
        //выключаем
        tv.PressOffButton();


    }
}
