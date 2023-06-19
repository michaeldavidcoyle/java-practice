package masterclass.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
//        Generic Animal moves slow.
//        Generic Animal makes an animal noise.
//        Animal{type='Generic Animal', size='Huge', weight=400.0}

        Dog dog = new Dog();
        // doAnimalStuff requires an Animal for first argument
        // Dog argument works because Dog "IS A" type of Animal, a child or subclass of Animal
        doAnimalStuff(dog, "fast");
        // before passing arguments to super()
//        null moves fast.
//        null makes an animal noise.
//        Animal{type='null', size='null', weight=0.0}
        // after passing arguments to super()
//        Mutt moves fast.
//        Mutt makes an animal noise.
//        Animal{type='Mutt', size='Big', weight=50.0}

        Dog pug = new Dog("Pug", 15);
        doAnimalStuff(pug, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 4);
        doAnimalStuff(wolf, "slow");

        Fish goldfish = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldfish, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal);
        System.out.println("------------------------");
    }
}
