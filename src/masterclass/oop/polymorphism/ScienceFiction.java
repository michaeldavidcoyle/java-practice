package masterclass.oop.polymorphism;

public class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(
                "...%s%n".repeat(5),
                "Long shot of planet in space",
                "Aliens do bad stuff",
                "Space guys do stuff",
                "All seems lost",
                "The planet is saved"
        );
    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction thriller");
    }
}
