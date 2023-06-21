package masterclass.oop.polymorphism;

public class AnotherMovieTheater {
    public static void main(String[] args) {
        Movie theMovie = Movie.getMovie("A", "Jaws");
        theMovie.watchMovie();

        /*
        * compile error, required type Adventure, provided type Movie
        * It doesn't matter that Adventure is being passed as type,
        * the compiler sees that the getMovie method may return any
        * subclass of Movie
        */
        // Adventure adventure = Movie.getMovie("A", "Jaws");

        // casting could help here...
        Adventure adventure = (Adventure) Movie.getMovie("A", "Jaws");
        adventure.watchMovie();

        // runtime error:
        // ClassCastException: Comedy cannot be cast to class Adventure
//        Adventure comedy = (Adventure) Movie.getMovie("C", "Jaws");

        // compiles, but...
        Object objectiveComedy = Movie.getMovie("C", "Airplane");
        // Cannot resolve method 'watchMovie' in 'Object'
//        objectiveComedy.watchMovie();

        // possible, but...
        Movie comedyMovie = (Movie) objectiveComedy;
        comedyMovie.watchMovie();
        // no access to methods specific to Comedy class
//        comedyMovie.watchComedy();

        // Local Variable Type Inference
        var tootsie = Movie.getMovie("C", "Tootsie");
        tootsie.watchMovie();

        var clue = new Comedy("Clue");
        clue.watchComedy();

        // tests for object type
        Object unknownObject = Movie.getMovie("C", "Being There");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();;
        }
    }
}
