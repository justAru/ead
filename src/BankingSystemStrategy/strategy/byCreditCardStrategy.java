package BankingSystemStrategy.strategy;

import BankingSystemStrategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class byCreditCardStrategy implements PaymentStrategy {
//    ArrayList<String> cardDetails = new ArrayList<String>();
//    Map<String, String> detail = new HashMap<String, String>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void paymentDetails() {
        ArrayList<String> cardDetails = new ArrayList<String>();
        Map<String, String> detail = new HashMap<String, String>();
        System.out.println("Enter card number:");
        cardDetails.add(detail.put("Card number: ", scanner.next()));
        System.out.println("Card validity period");
        cardDetails.add(detail.put("Card validity period: ", scanner.next()));
        System.out.println("First name and Last name");
        cardDetails.add(detail.put(scanner.next(), scanner.next()));
        System.out.println("CVV/CVC");
        cardDetails.add(detail.put("CVV/CVC ", scanner.next()));

        System.out.println("Make sure that your data is correct: ");
        for (String element : cardDetails) {
            System.out.println(element);
        }
    }
}
