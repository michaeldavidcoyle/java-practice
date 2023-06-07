package collections;

// HashSet
// class in Java Collections API
// stores unique objects, no duplicates allowed
// order is not guaranteed
// no index available
// stores values in a HashMap

import java.util.HashSet;
import java.util.Objects;

public class Party {
    public static void main(String[] args) {
        HashSet<Friend> friends = new HashSet<>();
        friends.add(new Friend("Mike", 49));
        friends.add(new Friend("Norbert", 47));
        friends.add(new Friend("Mike", 49)); /* creates duplicate entry because hashcode/equals uses memory
            location by default and using 'new Friend' creates new object in memory */
        System.out.println(friends);
    }
}

class Friend {
    String name;
    int age;

    Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return age == friend.age && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}