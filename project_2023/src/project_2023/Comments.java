package project_2023;
//Comments for movies 
public class Comments {
	private String  name;
	private String  comment;
	private int  value;
	
	Comments (String name, String comment, int value){
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
	int GetValue() {
		return value;
	}
	void PrintAll() {
		
	}
	
}
