public class Bank {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setBalance(double newBalance) {
        if (balance < 0) {
            balance = newBalance;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount + "... ");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Error: Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance");
        } else if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount + "... ");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Error: Invalid amount");
        }
    }

    public String getStatus() {
        if (balance < 0) {
            return "Inactive account";
        } else {
            return "Active account";
        }
    }

    public void displayInfo() {
        System.out.println("===========================");
        System.out.println(" Bank Account Details");
        System.out.println("===========================");
        System.out.println("Account No : " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
        System.out.println("Status : " + getStatus());
        System.out.println("===========================");
        // System.out.printf("Account Number: %s \nAccount Holder: %s \nBalance: %.2f
        // \nAccount Type: %s",
        // getAccountNumber(), getAccountHolder(), getBalance(), getAccountType());
    }

 public String addDetails(String accNo, String holder, String type) {
        if (accNo == null || accNo.isEmpty()) {
            return "Invalid Account Number!";
        }
        if (holder == null || holder.isEmpty()) {
            return "Invalid Account Holder Name!";
        }
        if (!(type.equalsIgnoreCase("Savings") || type.equalsIgnoreCase("Current"))) {
            return "Invalid Account Type! Must be Savings or Current.";
        }

        accountNumber = accNo;
        accountHolder = holder;
        accountType = type;
        balance = 0.0;

        return "Account details added successfully.";
    }

    public static void main(String[] args) {
         Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        // Add details
        System.out.println(acc1.addDetails("PK-1023", "Ali Hassan", "Savings"));
        System.out.println(acc2.addDetails("PK-2045", "Sara Khan", "Current"));

        // Set initial balance
        acc1.setBalance(5000);
        acc2.setBalance(3000);

        // Display info
        acc1.displayInfo();
        acc2.displayInfo();

        // Perform operations
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.withdraw(10000);

        // Compare balances
        if (acc1.getBalance() > acc2.getBalance()) {
            System.out.println(acc1.getAccountHolder() + " has a higher balance than " + acc2.getAccountHolder());
        } else {
            System.out.println(acc2.getAccountHolder() + " has a higher balance than " + acc1.getAccountHolder());
        }
    }
}
