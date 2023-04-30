package project_2023;
//Class for creation of database for movies and work with it
public class DbMovies implements TypeM{
	private String name;
	private String genre;
	private String director;
	private int year;
	//Common constructor	
	DbMovies (String name, String genre, String director, int year){
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.year = year;
	}
	//Getters and Setters
	@Override
	public void SetName(String name) {
		this.name = name;
	}
	@Override
	public void SetGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void SetDirector(String director) {
		this.director = director;
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
	public String GetGenre() {
		// TODO Auto-generated method stub
		return genre;
	}
	@Override
	public String GetDirector() {
		// TODO Auto-generated method stub
		return director;
	}
	@Override
	public int GetYear() {
		// TODO Auto-generated method stub
		return year;
	}
	@Override
	public void AddMovie() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void UpgradeMovie() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeleteMovie() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void PrintAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void PrintAllSame() {
		// TODO Auto-generated method stub
		
	}
	
}
