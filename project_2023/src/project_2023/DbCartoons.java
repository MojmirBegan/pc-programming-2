package project_2023;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DbCartoons<T> implements TypeM {
	private String name;
	private Genres genre;
	private Directors director;
	private int year;
	List<Animators> listOfAnimators = new ArrayList<Animators>();
	List<Comments> listOfComments = new ArrayList<Comments>();
	private Map<String, DbCartoons> collectionOfCartoons;
	//Common constructor	
	DbCartoons (String name, Genres genre, Directors director, int year, List<Animators> listOfAnimators, List<Comments> listOfComments){
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.year = year;
		this.listOfAnimators = listOfAnimators;
		this.listOfComments = listOfComments;
	}
	public DbCartoons(){
		collectionOfCartoons = new HashMap<String, DbCartoons>();
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
	public List<Animators> GetAnimators() {
		// TODO Auto-generated method stub
		return listOfAnimators;
	}
	public List<Comments> GetComments() {
		// TODO Auto-generated method stub
		return listOfComments;
	}	
	public void AddMovie(String name, Genres genre, Directors director, int year, List<Animators> listOfAnimators, List<Comments> listOfComments) {
		// TODO Auto-generated method stub	
		collectionOfCartoons.put(name, new DbCartoons(name, genre, director, year, listOfAnimators, listOfComments));
	}
	@Override
	public void UpgradeMovie() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeleteMovie(String name) {
		// TODO Auto-generated method stub
		collectionOfCartoons.remove(name);
	}
	@Override
	public void PrintAll() {
		// TODO Auto-generated method stub
		Set<String> list = collectionOfCartoons.keySet();
		for (String name: list) {
			System.out.println(collectionOfCartoons.get(name).toString());
		}		
	}
	@Override
	public void PrintAllSame() {
		// TODO Auto-generated method stub		
	}
	@Override
	public String toString() {
		return ("Title: " + GetName() + "\n" + director.toString() + "\n" + "Year: " + GetYear() + "\n" + "Genre: " + GetGenre() + "\n" + listOfAnimators.toString() + "\n" + listOfComments.toString());		
	}
}
