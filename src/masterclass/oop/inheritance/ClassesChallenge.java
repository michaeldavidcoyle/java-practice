package masterclass.oop.inheritance;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber("444444444");
        myAccount.setBalance(100);
        myAccount.setCustomerName("Michael");
        myAccount.setEmail("michael@example.com");
        myAccount.setPhoneNumber("2105552222");

        myAccount.deposit(723.84);
        myAccount.withdraw(200);
        myAccount.withdraw(800);
    }
}
