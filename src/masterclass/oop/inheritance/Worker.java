package masterclass.oop.inheritance;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {
    }

    // end date is unlikely to be known when creating a new worker
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(0, 4));
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0d;
    }

    public void terminate(String endDate) {
        System.out.println("You're fired.");
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
