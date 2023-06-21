package masterclass.oop.polymorphism;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(
                "...%s%n".repeat(5),
                "Something funny happens",
                "Something even funnier happens",
                "Stuff gets real",
                "Something absolutely hilarious happens",
                "Happy Ending"
        );
    }
}
