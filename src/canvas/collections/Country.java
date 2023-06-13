package canvas.collections;

import java.util.HashMap;

public class Country {
    public static void main(String[] args) {
        HashMap<String, Citizen> citizens = new HashMap<>();
        citizens.put("4001", new Citizen("John"));
        citizens.put("2523", new Citizen("Lucy"));
        citizens.put("5730", new Citizen("Bob"));

        citizens.put("4001", new Citizen("David")); // overwrites value w/ key 4001
        citizens.putIfAbsent("4001", new Citizen("Wayne")); // overwrites value only if no key 4001

        System.out.println(citizens.get("4001").name);
        System.out.println(citizens.get("2523").name);
        // returns default value if null
        System.out.println(citizens.getOrDefault("1001", new Citizen("Doe")).name);

        System.out.println(citizens.size()); // returns number of key/value pairs

        System.out.println(citizens.containsKey("4001")); // true
        System.out.println(citizens.containsValue(new Citizen("Brian"))); // false

        System.out.println(citizens.entrySet()); // returns Set of key/value pairs
        System.out.println(citizens.keySet()); // returns Set of keys
        System.out.println(citizens.values()); // returns a Collection view of the values contained in this map
    }
}

class Citizen {
    String name;

    Citizen(String name) {
        this.name = name;
    }
}