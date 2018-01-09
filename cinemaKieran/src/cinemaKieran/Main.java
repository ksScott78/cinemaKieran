package cinemaKieran;

public class Main {
	

public static void main(String args[]) {
	Service s = new Service();
	Movie rambo = new Movie("Rambo", "Action", "15");
	s.addMovie(rambo);
	s.deleteMovie(1);
}


}
