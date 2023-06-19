package masterclass.oop.inheritance;

public class SchoolAdmin {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student student = new Student(
                    "S47900" + i,
                    switch (i) {
                        case 1 -> "Bob";
                        case 2 -> "Sally";
                        case 3 -> "Mary";
                        case 4 -> "Beth";
                        case 5 -> "Blake";
                        default -> "Anonymous";
                    },
                    "05-15-2003",
                    "Java Masterclass"
            );

            System.out.println(student);
        }

        for (int i = 1; i <= 5; i++) {
            LPAStudent student = new LPAStudent(
                    "S12300" + i,
                    switch (i) {
                        case 1 -> "Christina";
                        case 2 -> "Olivia";
                        case 3 -> "Michael";
                        case 4 -> "Sonya";
                        case 5 -> "Kristina";
                        default -> "Anonymous";
                    },
                    "11-23-1979",
                    "Java Masterclass"
            );

            System.out.println(student);
        }

        Student pojoStudent = new Student(
                "S101005",
                "Sarah",
                "12-25-1973",
                "d3.js - Data Visualization"
        );

        LPAStudent recordStudent = new LPAStudent(
                "S483001",
                "Margaret",
                "05-15-2008",
                "p5.js, The Good Stuff"
        );

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // compile error, records have no setters. Fields can only be set in the header
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(
            pojoStudent.getName() + " is taking " + pojoStudent.getClassList()
        );
        System.out.println(
            recordStudent.name() + " is taking " + recordStudent.classList()
        );
    }
}
