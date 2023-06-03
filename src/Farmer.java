// inheritance
//    * passing down state and behavior from one class to another
//    * super-class / sub-class
//    * parent / child
//    * facilitates code reusability
//    * extensibility

public class Farmer {
    public static void main(String[] args) {
        Pickle pickle = new Pickle();
        pickle.grow(); // inherited from Cucumber
    }
}

class Cucumber {
    double calories;
    public void grow() {
        System.out.println("I'm growing!");
    }
}

class Pickle extends Cucumber {
    public Pickle() {
        // variable can be accessed w/o explicitly defining it because of inheritance
        calories = calories * 0.7;
    }
}
