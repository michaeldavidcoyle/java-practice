package masterclass.oop.inheritance;

// parenthesis called record header
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}

// for each component of header, Java creates:
// a field with the same type and name
// a toString method that prints out each attribute
// accessor method with same name as attribute/field
