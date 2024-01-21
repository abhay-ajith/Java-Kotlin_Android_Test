import java.util.Scanner;

// Base class for Bank Account
class BankAccount {
    protected String accType;
    double balance;

    public BankAccount(String accType) {
        this.accType = accType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass for Fixed Deposit
class FixedDeposit extends BankAccount {
    private int tenureMonths;

    public FixedDeposit(int tenureMonths) {
        super("Fixed Deposit");
        this.tenureMonths = tenureMonths;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("Fixed Deposit created for " + tenureMonths + " months.");
    }
}

//Main Class
public class BankApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        System.out.println("Welcome, " + userName + "!");

        BankAccount savingsAccount = null;
        BankAccount currentAccount = null;
        BankAccount dematAccount = null;
        FixedDeposit fixedDeposit = null;

        while (true) {
            System.out.println("Choose an account type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Demat Account");
            System.out.println("4. Fixed Deposit");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (savingsAccount == null) {
                        savingsAccount = new BankAccount("Savings");
                    }

                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Exit");
                    int op1 = sc.nextInt();

                    switch (op1) {
                        case 1:
                            savingsAccount.deposit(1000.0);
                            break;
                        case 2:
                            savingsAccount.withdraw(500.0);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    if (currentAccount == null) {
                        currentAccount = new BankAccount("Current");
                    }

                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Exit");
                    int op2 = sc.nextInt();

                    switch (op2) {
                        case 1:
                            currentAccount.deposit(1000);
                            break;
                        case 2:
                            currentAccount.withdraw(500);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 3:
                    if (dematAccount == null) {
                        dematAccount = new BankAccount("Demat");
                    }

                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Exit");
                    int op3 = sc.nextInt();

                    switch (op3) {
                        case 1:
                            dematAccount.deposit(1000);
                            break;
                        case 2:
                            dematAccount.withdraw(500);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 4:
                    if (fixedDeposit == null) {
                        System.out.print("Enter the tenure for Fixed Deposit (in months): ");
                        int tenureMonths = sc.nextInt();
                        fixedDeposit = new FixedDeposit(tenureMonths);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Exiting...");
            }
        }
    }
}