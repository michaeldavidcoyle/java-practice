package collections;

// Queue
// interface in the Java Collections API
// first-in/first-out
// push to the tail
// pop from the head
// allows duplicate elements
// preserves insertion order

import java.util.LinkedList;
import java.util.Queue;

public class Checkout {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        // add (push) new element to the tail
        queue.offer(new Person("Bob"));
        queue.offer(new Person("John"));
        queue.offer(new Person("Maggie"));

        // check what's at the head of the queue
        Person headOfLine = queue.peek(); // Bob
        System.out.println("There are " + queue.size() + " people in line.");
        if (headOfLine != null) {
            System.out.println(headOfLine.name + " is at the front of the line.");
        }

        // 'pop' the head of the queue
        Person headOfQueue = queue.poll();
        if (headOfQueue != null) {
            System.out.println(headOfQueue.name + " is no longer in line."); // Bob
        }

        System.out.println("There are " + queue.size() + " people in line: ");
        for (Person person : queue) {
            if (person != null) {
                System.out.println(person.name);
            }
        }
    }
}

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}