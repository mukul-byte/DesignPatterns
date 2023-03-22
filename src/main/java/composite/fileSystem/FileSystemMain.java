package composite.fileSystem;

public class FileSystemMain {
    public static void main(String[] args) {
        Directory movies = new Directory("movies");
        Directory comedyMovies = new Directory("comedy movies");
        Directory actionMovies = new Directory("action movies");
        comedyMovies.add(new File("hulchul"));
        comedyMovies.add(new File("paalpanti"));
        actionMovies.add(new File("rrr"));
        actionMovies.add(new File("kesari"));
        movies.add(comedyMovies);
        movies.add(actionMovies);

        movies.ls(0);
    }
}
