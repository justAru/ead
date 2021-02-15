package BankingSystemStrategy;

import BankingSystemStrategy.strategy.byCashStrategy;
import BankingSystemStrategy.strategy.byCreditCardStrategy;
import BankingSystemStrategy.strategy.byPaypalStrategy;
import java.util.Scanner;

    public class PaymentClient {
        public static void printMenu() {
            System.out.println("\n<-------------- Menu --------------->");
            System.out.println("|    <1> Take a loan                   |");
            System.out.println("|    <2> Online purchase               |");
            System.out.println("|    <0> Exit                          |");
            System.out.println("<------------------------------------->");
        }

        public static void processUserChoice(int userChoice) {
            switch (userChoice) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Take a loan by>>>");
                    break;
                case 2:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Online purchase via>>>");
                    break;
                default:
                    System.out.println("\nChoose from 0 - 2!");
            }
        }

        public static void printStrategy() {
            System.out.println("\n<-------------- TYPE --------------->");
            System.out.println("|    <1> by Cash                       |");
            System.out.println("|    <2> by Credit Card                |");
            System.out.println("|    <3> by PayPal                     |");
            System.out.println("|    <0> Exit                          |");
            System.out.println("<------------------------------------->");
        }

        public static void processUserMiniChoice(int userMiniChoice) {
            switch (userMiniChoice) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Cash operations");
                    PaymentContext context = new PaymentContext();
                    context.setPaymentStrategy(new byCashStrategy());
                    break;
                case 2:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Credit Card operations");
                    PaymentContext context1 = new PaymentContext();
                    context1.setPaymentStrategy(new byCreditCardStrategy());
                    break;
                case 3:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("PayPal operations");
                    PaymentContext context2 = new PaymentContext();
                    context2.setPaymentStrategy(new byPaypalStrategy());
                    break;
                default:
                    System.out.println("\nChoose from 0 - 3!");
            }
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            printMenu();
            while (true) {
                System.out.print("\nChoose the point from main menu: ");
                int userChoice = scanner.nextInt();
                scanner.nextLine();
                if (userChoice == 0)
                    break;
                processUserChoice(userChoice);
                printStrategy();
                while (true){
                    System.out.print("\nChoose the point from menu: ");
                    int userMiniChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (userMiniChoice == 0)
                        break;
                    processUserMiniChoice(userMiniChoice);
                }
            }
            System.out.println("\nGood-bye!");
//            PaymentContext context = new PaymentContext();
//            context.setPaymentStrategy(new byCreditCardStrategy());
        }
    }

