package masterclass.abstraction.interfaces;

/*
* An interface is similar to an abstract class, though it isn't a class at all.
* It's a special type that's more like a contract between the class and client code, that the compiler enforces.
* By declaring it is using an interface, your class must implement all the abstract methods on the interface.
* A class agrees to this because it wants to be known by that type, by the outside world, or the client code.
* An interface lets classes that might have little else in common, be recognized as a special reference type.
*
* An interface is usually named according to the set of behaviors it describes.
* Many interfaces will end in 'able', like Comparable and Iterable, again meaning something is capable, or can do, a
* given set of behaviors.
*/

interface FlightEnabled {
    // There is no such thing as instance fields on an interface.
    // All fields declared on an interface are final and static.
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    public abstract void takeOff(); // public modifier is redundant as all interface methods are implicitly public
    abstract void land(); // abstract modifier is redundant for interfaces
    void fly();
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
