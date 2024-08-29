import java.util.Scanner;

public class ATM {

    private double balance;

    public ATM(double initialBalance) {

        this.balance = initialBalance;

    }

    public void checkBalance() {

        System.out.println("Your balance is: $" + balance);

    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("You have successfully deposited $" + amount);

            checkBalance();

        } else {

            System.out.println("Invalid deposit amount.");

        }

    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.println("You have successfully withdrawn $" + amount);

            checkBalance();

        } else if (amount > balance) {

            System.out.println("Insufficient balance.");

        } else {

            System.out.println("Invalid withdrawal amount.");

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM(1000.00); // Initialize with a default balance of $1000.00

        while (true) {

            System.out.println("Welcome to the ATM!");

            System.out.println("1. Check Balance");

            System.out.println("2. Deposit");

            System.out.println("3. Withdraw");

            System.out.println("4. Exit");

            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    atm.checkBalance();

                    break;

                case 2:

                    System.out.print("Enter amount to deposit: $");

                    double depositAmount = scanner.nextDouble();

                    atm.deposit(depositAmount);

                    break;

                case 3:

                    System.out.print("Enter amount to withdraw: $");

                    double withdrawAmount = scanner.nextDouble();

                    atm.withdraw(withdrawAmount);

                    break;

                case 4:

                    System.out.println("Thank you for using the ATM. Goodbye!");

                    scanner.close();

                    System.exit(0);

                default:

                    System.out.println("Invalid choice. Please try again.");

            }

            System.out.println();

        }

    }

}




