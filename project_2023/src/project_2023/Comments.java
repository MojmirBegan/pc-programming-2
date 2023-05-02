package project_2023;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Comments for movies 
public class Comments<T> {
	List<Comments> listOfComments = new ArrayList<Comments>();	
	private String  name;
	private String  comment;
	private double  value;	
	Comments (String name, String comment, double value){
		this.name = name;
		this.comment = comment;
		this.value = value;
	}	
	String GetName() {
		return name;
	}
	String GetComment() {
		return comment;
	}
	double GetValue() {
		return value;
	}	
	void AddComment(String name, String comment, int value) {
		listOfComments.add(new Comments(name, comment, value));
	}	
	void DeleteActor(String name) {
		for (int i = 0; i < listOfComments.size(); i++) {
			if (listOfComments.get(i).GetName() == name) {
				listOfComments.remove(i);
			}
		}
	}	
	void PrintAll() {
		// TODO Auto-generated method stub			
		System.out.println("All Actors: ");
		for (int i = 0; i < listOfComments.size(); i++) {
		System.out.println(listOfComments.get(i).toString());
		}
	}	
	public String toString() {
		// TODO Auto-generated method stub
		return (GetName() + ": \t" + GetComment() + " ||" + "\t" + GetValue() + "\n");
	}
}
