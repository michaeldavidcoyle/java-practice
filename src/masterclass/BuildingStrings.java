package masterclass;

public class BuildingStrings {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloString = new StringBuilder("Hello World");
        helloString.append(" and Goodbye");

        StringBuilder emptyString = new StringBuilder();
        emptyString.append("*".repeat(17));
        StringBuilder capacityString = new StringBuilder(32);
        capacityString.append("*".repeat(17));
        StringBuilder otherString = new StringBuilder(helloString);
        // compile error
//        StringBuilder literalString = "Hello World";

        printInformation(helloWorld);
        printInformation(helloString);

        printInformation(emptyString);
        printInformation(capacityString);
        printInformation(otherString);

        // deleteChatAt and insert
        StringBuilder builder = new StringBuilder("Hello World");
        builder.append(" and Goodbye");
        int index = builder.indexOf("G");
        builder.deleteCharAt(index).insert(index, 'g');
        System.out.println(builder);

        // replace
        builder.replace(index, index + 1, "G");
        System.out.println(builder);

        // reverse and setLength
        builder.reverse().setLength(7);
        System.out.println(builder);
    }

    public static void printInformation(String string) {
        System.out.println("String value: " + string);
        System.out.println("String length: " + string.length());
        System.out.println("-".repeat(24));
    }

    public static void printInformation(StringBuilder string) {
        System.out.println("String value: " + string);
        System.out.println("String length: " + string.length());
        System.out.println("String capacity: " + string.capacity());
        System.out.println("-".repeat(24));
    }
}
