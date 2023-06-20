package masterclass.oop.inheritance;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(
            String name,
            String birthDate,
            String hireDate,
            double annualSalary
    ) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        double bimonthly = annualSalary / 24d;

        return !isRetired ? bimonthly : bimonthly * 0.5;
    }

    public void retire() {
        System.out.println(this.getName() + ", congratulations on your retirement.");
        terminate("2023-06-19");
        isRetired = true;
        annualSalary *= 0.5;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }
}
