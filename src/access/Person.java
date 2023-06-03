package access;

// encapsulation is the bundling of related properties and behavior
// and protecting them from undesired access

// access modifiers
//   * public - accessible anywhere in the application
//   * protected - accessible only within the package and any subclasses
//   * no modifier (default) - accessible only within the package
//   * private - accessible only within the class

public class Person {
    private int age;
    Computer pc = new Computer();

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public void code() {
        // allowed because Person and Computer both reside within the access package
        pc.code();
    }
}

class House {
    public void tenant() {
        Person person = new Person();
        // will not compile because the age property is NOT visible outside of Person
//        person.age = -1;
        // instead, the setter method must be used
        person.setAge(42);

        // allowed because the pc property has default access modifier: visible within the package
        person.pc = new Computer();
    }
}