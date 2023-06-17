package masterclass.oop.inheritance;

public class ConstructorChallenge {
    public static void main(String[] args) {
        // no arg constructor
        Customer theManWithNoName = new Customer();
        System.out.println("Customer Name: " + theManWithNoName.getName());
        System.out.println("Customer Email: " + theManWithNoName.getEmail());
        System.out.println("Credit Limit: " + theManWithNoName.getCreditLimit());
        System.out.println("--------------------------------------------");

        // constructor w/ name and email parameters
        Customer mike = new Customer("Mike", "mike@email.org");
        System.out.println("Customer Name: " + mike.getName());
        System.out.println("Customer Email: " + mike.getEmail());
        System.out.println("Credit Limit: " + mike.getCreditLimit());
        System.out.println("--------------------------------------------");

        // constructor w/ parameters for each field
        Customer tim = new Customer("Tim", 100_000, "timmy@spurs.com");
        System.out.println("Customer Name: " + tim.getName());
        System.out.println("Customer Email: " + tim.getEmail());
        System.out.println("Credit Limit: " + tim.getCreditLimit());
    }
}
