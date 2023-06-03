package examplePackage.a; // must be first line of code

import examplePackage.b.Key;

public class Door {
    // Key class from examplePackage.b
    Key key;
    // fully-qualified class name to make use of a different Key class
    java.security.Key key2;
}
