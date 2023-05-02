package project_2023;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
//Class for creation of database for movies and work with it
public class DbMovies<T> implements TypeM{
	private String name;
	private Genres genre;
	private Directors director;
	private int year;
	private List<Actors> listOfActors = new ArrayList<Actors>();	
	private List<Comments> listOfComments = new ArrayList<Comments>();
	private Map<String, DbMovies> collectionOfMovies;
	//Common constructor	
	DbMovies (String name, Genres genre, Directors director, int year, List<Actors> listOfActors, List<Comments> listOfComments){
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.year = year;
		this.listOfActors = listOfActors;
		this.listOfComments = listOfComments;
	}
	public DbMovies(){
		collectionOfMovies = new HashMap<String, DbMovies>();
	}
	//Getters and Setters
	@Override
	public void SetName(String name) {
		this.name = name;
	}
	@Override
	public void SetGenre(Genres genre) {
		this.genre = genre;
	}
	
	@Override
	public void SetDirector(String name) {		
		director.SetName(name);
	}
	@Override
	public void SetYear(int year) {
		// TODO Auto-generated method stub
		this.year = year;
	}
	@Override
	public String GetName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public Genres GetGenre() {
		// TODO Auto-generated method stub
		return genre;
	}
	@Override
	public Directors GetDirector() {
		// TODO Auto-generated method stub
		return director;
	}
	@Override
	public int GetYear() {
		// TODO Auto-generated method stub
		return year;
	}
	public List<Actors> GetActors() {
		// TODO Auto-generated method stub
		return listOfActors;
	}
	public List<Comments> GetComments() {
		// TODO Auto-generated method stub
		return listOfComments;
	}	
	public void AddMovie(String name, Genres genre, Directors director, int year, List<Actors> listOfActors, List<Comments> listOfComments) {
		// TODO Auto-generated method stub
		collectionOfMovies.put(name, new DbMovies(name, genre, director, year, listOfActors, listOfComments));
	}
	@Override
	public void UpgradeMovie() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeleteMovie(String name) {
		// TODO Auto-generated method stub
		collectionOfMovies.remove(name);
	}
	@Override
	public void PrintAll() {
		// TODO Auto-generated method stub
		Set<String> list = collectionOfMovies.keySet();
		for (String name: list) {
			System.out.println(collectionOfMovies.get(name).toString());
		}
	}
	@Override
	public void PrintAllSame() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return ("Title: " + GetName() + "\n" + director.toString() + "\n" + "Year: " + GetYear() + "\n" + "Genre: " + GetGenre() + "\n" + listOfActors.toString() + "\n" + listOfComments.toString());		
	}
}
