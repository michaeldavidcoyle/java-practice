package masterclass.oop.polymorphism;

public class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(
                "...%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens"
        );
    }
}
