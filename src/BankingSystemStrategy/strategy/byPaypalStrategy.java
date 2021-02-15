package BankingSystemStrategy.strategy;

import BankingSystemStrategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class byPaypalStrategy implements PaymentStrategy {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void paymentDetails() {
        ArrayList<String> accountDetails = new ArrayList<String>();
        Map<String, String> detail = new HashMap<String, String>();
        System.out.println("E-mail address: ");
        accountDetails.add(detail.put("E-mail address: ", scanner.next()));
        System.out.println("Password: ");
        accountDetails.add(detail.put("password: ", scanner.next()));

        System.out.println("Make sure that your data is correct: ");
        for (String element : accountDetails) {
            System.out.println(element);
        }
    }
}
