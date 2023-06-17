package masterclass.oop.inheritance;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        BankAccount myAccount = new BankAccount(
            "444444444",
            100,
            "Michael",
            "michael@example.com",
            "2105552222"
        );

        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
//        myAccount.setAccountNumber("444444444");
//        myAccount.setBalance(100);
//        myAccount.setCustomerName("Michael");
//        myAccount.setEmail("michael@example.com");
//        myAccount.setPhoneNumber("2105552222");

        myAccount.deposit(723.84);
        myAccount.withdraw(200);
        myAccount.withdraw(800);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "8005554TIM");
        System.out.println("Account number: " + timsAccount.getAccountNumber());
        System.out.println("Customer: " + timsAccount.getCustomerName());
    }
}
