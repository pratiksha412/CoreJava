package access_specifier;
import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}

class Watchlist {
    private ArrayList<Movie> movies;

    public Watchlist() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println(movie.getTitle() + " has been added to your watchlist.");
    }

    public void removeMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movies.remove(movie);
                System.out.println(title + " has been removed from your watchlist.");
                return;
            }
        }
        System.out.println("Movie not found in your watchlist.");
    }

    public void displayWatchlist() {
        if (movies.isEmpty()) {
            System.out.println("Your watchlist is empty.");
        } else {
            System.out.println("Your Watchlist:");
            for (Movie movie : movies) {
                System.out.println("- " + movie.getTitle() + " (" + movie.getGenre() + ")");
            }
        }
    }
}

public class MovieWatchlist {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        Watchlist watchlist = new Watchlist();

	        while (true) {
	            System.out.println("\n1. Add movie to watchlist");
	            System.out.println("2. Remove movie from watchlist");
	            System.out.println("3. Display watchlist");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter movie title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter movie genre: ");
	                    String genre = scanner.nextLine();
	                    Movie newMovie = new Movie(title, genre);
	                    watchlist.addMovie(newMovie);
	                    break;
	                case 2:
	                    System.out.print("Enter movie title to remove: ");
	                    String removeTitle = scanner.nextLine();
	                    watchlist.removeMovie(removeTitle);
	                    break;
	                case 3:
	                    watchlist.displayWatchlist();
	                    break;
	                case 4:
	                    System.out.println("Exiting program. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }
	        }
	    }
	}

