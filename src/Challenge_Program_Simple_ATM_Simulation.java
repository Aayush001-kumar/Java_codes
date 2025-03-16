import java.util.*;

public class Challenge_Program_Simple_ATM_Simulation {
    private static double userBalance;
    private static int userPin;

    public static void main(String[] args) {
        Scanner amt = new Scanner(System.in);
        int choice;
        accountSetup(amt);
        if (!verification(amt)) {
            System.out.println("Too many incorrect attempts\nYou are out of attempts\nExiting...");
            return;
        }
        System.out.println("Welcome to our ATM simulation");
        while (true) {
            System.out.println("Please Enter your choice");
            System.out.println("Press 1 for Checking bank balance");
            System.out.println("Press 2 for Depositing amount");
            System.out.println("Press 3 for Withdrawing amount");
            System.out.println("Press 4 for Exit");
            choice = amt.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(amt);
                    break;
                case 3:
                    withdraw(amt);
                    break;
                case 4:
                    System.out.println("Thanks for using our service\nExiting...");
                    amt.close();
                    return;
                default:
                    System.out.println("Invalid choice!\nPLease enter a valid choice");
            }
        }
    }

    public static void accountSetup(Scanner amt) {
        System.out.println("Set your 4 digit pin");
        while (true) {
            if (amt.hasNextInt()) {
                userPin = amt.nextInt();
                if (userPin >= 0000 && userPin <= 9999) {
                    break;
                } else {
                    System.out.println("Please enter a valid 4 digit pin");
                }
            } else {
                System.out.println("Enter a valid input!(only digits)");
                amt.next();
            }
        }
        System.out.println("Enter your initial bank amount");

        while (true) {
            if (amt.hasNextDouble()) {
                userBalance = amt.nextDouble();
                if (userBalance >= 0) {
                    break;
                } else {
                    System.out.println("Bank balance can not be negative!\nPlease enter a valid input");
                }
            } else {
                System.out.println("Invalid input! PLease enter a valid input");
                amt.next();
            }
        }
    }

    public static boolean verification(Scanner amt) {
        int attempts = 5;
        System.out.println("Enter your 4 digit pin");
        while (attempts > 0) {
            if (amt.hasNextInt()) {
                int pin = amt.nextInt();
                if (pin == userPin) {
                    System.out.println("Verification Successful");
                    System.out.println();
                    return true;
                } else {
                    System.out.println("You have entered the wrong pin");
                    attempts--;
                    System.out.println("Attempts remaining:" + attempts);
                }
            } else {
                System.out.println("Invalid input! Please enter a valid input");
                amt.next();
            }
        }
        return false;
    }

    public static void checkBalance() {
        System.out.print("Your current bank balance is ₹" + userBalance);
        System.out.println();
    }

    public static void deposit(Scanner amt) {
        System.out.println("Enter the amount to Deposit");
        while(true){
            if(amt.hasNextDouble()){
                double depositAmt = amt.nextDouble();
                if(depositAmt > 0){
                    userBalance += depositAmt;
                    System.out.println("Successfully deposited ₹" + depositAmt);
                    break;
                } else {
                    System.out.println("Invalid amount, please enter a valid amount");
                }
            } else{
                System.out.println("Invalid input! Please enter a valid input");
                amt.next();
            }
        }
        System.out.println("Your current bank balance is ₹" + userBalance);
    }

    public static void withdraw(Scanner amt) {
        System.out.println("Enter the amount to withdraw");
        while (true) {
            if (amt.hasNextDouble()) {
                double withdrawAmt = amt.nextDouble();
                if (withdrawAmt > 0 && withdrawAmt <= userBalance) {
                    userBalance -= withdrawAmt;
                    System.out.println("Successfully withdrew ₹" + withdrawAmt);
                    break;
                } else {
                    if (withdrawAmt > userBalance) {
                        System.out.println("Insufficient balance, please enter a valid amount");
                    } else {
                        System.out.println("Invalid amount, please enter a valid amount");
                    }
                }
            } else {
                System.out.println("Invalid inp1    ut! Please enter a valid input");
                amt.next();
            }
            System.out.println("Your current bank balance is ₹" + userBalance);
        }
    }
}