package masterclass.oop.inheritance;

import java.util.Objects;

public class Corporation {
    public static void main(String[] args) {
        Worker essentialWorker = new Worker("Ezra", "1915-08-31");
        Employee steve = new Employee(
                "Steve",
                "1955-02-24",
                "1976-04-01");
        SalariedEmployee bill = new SalariedEmployee(
                "Bill",
                "1955-10-28",
                "1975-04-04",
                6_666_666d
        );
        HourlyEmployee mdc = new HourlyEmployee(
                "Michael",
                "1979-06-10",
                "2022-10-15",
                17.5
        );

        workerProfile(essentialWorker);
        workerProfile(steve);
        workerProfile(bill);
        workerProfile(mdc);

        System.out.println(bill);
        System.out.println(mdc);

        bill.retire();
        System.out.println(bill.getName() + "'s bimonthly pay is $" + bill.collectPay());
        System.out.println(mdc.getName() + "'s been working overtime and just got paid " + mdc.getDoublePay(20.75));
    }

    public static void workerProfile(Worker worker) {
        System.out.println(
                worker.getName() + " works for our company. Their birth date is " +
                worker.getBirthDate() + " so they are " + worker.getAge() + " years old."
        );
    }
}
