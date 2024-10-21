import java.util.Scanner;

public class AtmSystem {
    static int pin = 3214;
    static double accountBalance = 10000;
    static double machineRemainingBalance = 5000;
    static final double MAX_DEPOSIT_AMOUNT = 50000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your pin:");
        if (sc.hasNextInt()) {
            int userPin = sc.nextInt();
            if (userPin == pin) {
                System.out.println("1. Withdraw Money");
                System.out.println("2. Deposit Money");
                System.out.println("Please choose an option:");
                if (sc.hasNextInt()) {
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            // Withdraw process
                            System.out.println("Please enter the amount to withdraw:");
                            if (sc.hasNextInt()) {
                                int withdrawAmount = sc.nextInt();
                                if (withdrawAmount > 0 && withdrawAmount <= accountBalance && withdrawAmount <= machineRemainingBalance) {
                                    accountBalance -= withdrawAmount;
                                    machineRemainingBalance -= withdrawAmount;
                                    System.out.println("Please collect your money.");
                                    System.out.println("Remaining balance in your account: " + accountBalance);
                                    System.out.println("Remaining balance in ATM: " + machineRemainingBalance);
                                } else if (withdrawAmount > accountBalance) {
                                    System.out.println("Insufficient funds in your account.");
                                } else if (withdrawAmount > machineRemainingBalance) {
                                    System.out.println("ATM doesn't have enough money.");
                                } else {
                                    System.out.println("Please enter a valid amount.");
                                }
                            } else {
                                System.out.println("Please enter a valid amount.");
                            }
                            break;

                        case 2:
                            // Deposit process
                            System.out.println("Please enter the amount to deposit (Maximum 50,000):");
                            if (sc.hasNextInt()) {
                                int depositAmount = sc.nextInt();
                                if (depositAmount > 0 && depositAmount <= MAX_DEPOSIT_AMOUNT) {
                                    accountBalance += depositAmount;
                                    machineRemainingBalance += depositAmount;
                                    System.out.println("Your money has been deposited.");
                                    System.out.println("New balance in your account: " + accountBalance);
                                    System.out.println("New balance in ATM: " + machineRemainingBalance);
                                } else if (depositAmount > MAX_DEPOSIT_AMOUNT) {
                                    System.out.println("You can only deposit up to 50,000.");
                                } else {
                                    System.out.println("Please enter a valid deposit amount.");
                                }
                            } else {
                                System.out.println("Please enter a valid deposit amount.");
                            }
                            break;

                        default:
                            System.out.println("Invalid option selected.");
                    }
                } else {
                    System.out.println("Invalid input, please select a valid option.");
                }
            } else {
                System.out.println("Your pin does not match.");
            }
        } else {
            System.out.println("Invalid pin format.");
        }
        sc.close();
    }
}
