package canvas;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Sandwich s1 = new Sandwich();
        s1.size = 12;
        s1.meat = "ham";
        Sandwich s2 = new Sandwich();
        s2.size = 12;
        s2.meat = "salami";
        // System.out.println(s1 == s2); // bad practice
//        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

class Sandwich {
    int size;
    String meat;

    // lesson: throws null point exception
//    public boolean equals(Object o) {
//        Sandwich other = (Sandwich) o;
//        if (this.size == other.size) {
//            if (this.meat.equals(other.meat)) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    // lesson
//    public int hashCode() {
//        if (meat != null) {
//            return size * meat.hashCode();
//        } else {
//            return size;
//        }
//    }

    // generated by IntelliJ

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sandwich sandwich = (Sandwich) o;
        return size == sandwich.size && Objects.equals(meat, sandwich.meat);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(size, meat);
    }
}
