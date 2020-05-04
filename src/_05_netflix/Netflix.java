package _05_netflix;

public class Netflix {
public static void main(String[] args) {
Movie m1 = new Movie("Hi1", 1);	
Movie m2 = new Movie("Hi2", 2);	
Movie m3 = new Movie("Hi3", 3);	
Movie m4 = new Movie("Hi4", 4);	
Movie m5 = new Movie("Hi5", 5);	
System.out.println(m5.getTicketPrice());
NetflixQueue nq1 = new NetflixQueue();
nq1.addMovie(m1);
nq1.addMovie(m2);
nq1.addMovie(m3);
nq1.addMovie(m4);
nq1.addMovie(m5);
nq1.printMovies();
System.out.println("The best moive is " + nq1.getBestMovie());
nq1.sortMoviesByRating();
System.out.println("The second best moive is " + nq1.getMovie(1));
}
}