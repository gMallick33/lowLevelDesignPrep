import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("movies");
        directory.add(new File("border"));
        directory.add(new File("lapata ladies"));
        Directory comedyMovies = new Directory("comedy movies");
        comedyMovies.add(new File("Hulchul"));
        directory.add(comedyMovies);
        directory.ls();

    }
}