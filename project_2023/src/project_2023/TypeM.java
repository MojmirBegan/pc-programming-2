package project_2023;
//interface for Movies and Serials and so on....
//Everything they have in common
public interface TypeM {	
	//Getters and Setters
	void SetName(String name);
	void SetGenre(String genre);
	void SetDirector(String director);
	void SetYear(int year);
	String GetName();
	String GetGenre();
	String GetDirector();
	int GetYear();
	
	//Function for add movie
	void AddMovie();
	//Function for upgrade info about Movie
	void UpgradeMovie();
	//Function for delete movie
	void DeleteMovie();
	//Function for print database of movies
	void PrintAll();
	//Function for print list of movies with same actor
	void PrintAllSame();
}
