package proxyProject;

import java.util.Scanner;

public class realBank implements Bank {
    private String pin;

    public realBank(String pin) {
        this.pin = pin;
        checkPin();
}

    public void checkPin(){
        while (true) {
            if (pin.equals("1234")){
                System.out.println("Pin correct!");
                break;
            } else {
                System.out.println("Pin is not correct! Try again.");
            }
            break;
        }
    }



    @Override
    public void check() {
        System.out.println("Making transaction...");
        }

    }
