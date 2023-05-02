package project_2023;

import java.util.List;

//interface for Movies and Serials and so on....
//Everything they have in common
public interface TypeM {	
	//Getters and Setters
	void SetName(String name);
	void SetGenre(Genres genre);
	void SetDirector(String director);
	void SetYear(int year);
	String GetName();
	Genres GetGenre();
	Directors GetDirector();
	int GetYear();	
	//Function for upgrade info about Movie
	void UpgradeMovie();
	//Function for delete movie
	void DeleteMovie(String name);
	//Function for print database of movies
	void PrintAll();
	//Function for print list of movies with same actor
	void PrintAllSame();
	//toString
	String toString();
}
