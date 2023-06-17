package masterclass.oop.inheritance;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(
                "000000000",
                2.5,
                "Default Name",
                "Default Email",
                "##########");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(
            "000000000",
            1.5,
            customerName,
            email,
            phoneNumber
        );
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("Contructor with parameters called.");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount: $" + amount);
        printAccountBalance();
    }

    public void withdraw(double amount) {
        // do not allow negative balance
        if (balance - amount < 0) {
            System.out.println("Insufficient funds for withdrawal amount: $" + amount);
            printAccountBalance();
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal amount: $" + amount);
        printAccountBalance();
    }

    public void printAccountBalance() {
        System.out.println("Account Balance: $" + balance);
        System.out.println("-------------------------------");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
