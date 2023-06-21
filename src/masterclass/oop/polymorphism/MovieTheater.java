package masterclass.oop.polymorphism;

import java.util.Scanner;

public class MovieTheater {
    public static void main(String[] args) {
        Movie movie = new Movie("The Godfather");
        movie.watchMovie();
        System.out.println("-".repeat(24));

        Movie raidersOfTheLostArk = new Adventure("Raiders of the Lost Ark");
        raidersOfTheLostArk.watchMovie();
        System.out.println("-".repeat(24));

        Movie groundhogDay = new Comedy("Groundhog Day");
        groundhogDay.watchMovie();
        System.out.println("-".repeat(24));

        Movie dune = new ScienceFiction("Dune");
        dune.watchMovie();
        System.out.println("-".repeat(24));

        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
        theMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "Enter type (A: Adventure, C: Comedy, S: Science Fiction or Q to quit): "
            );
            String type = scanner.nextLine();

            if ("Qq".contains(type)) break;

            System.out.print("Enter movie title: ");
            String title = scanner.nextLine();
            Movie selectedMovie = Movie.getMovie(type, title);
            selectedMovie.watchMovie();
        }
    }
}
