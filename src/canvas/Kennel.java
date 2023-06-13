package canvas;

public class Kennel {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        pets[0] = new Dog();
        pets[1] = new Cat();
        pets[2] = new Bird();

        for (Animal pet: pets) {
            pet.speak();
        }
    }
}

abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    public void speak() {
        System.out.println("Chirp");
    }
}