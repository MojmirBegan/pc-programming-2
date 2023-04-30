package project_2023;
//Class for Actors, Animators, Directors
public abstract class People {
	private String name;
	private String role;
	//Common constructor
	People (String name, String role){
		this.name = name;
		this.name = role;		
	}
	//Getters and Setters
	void SetName(String name) {
		this.name = name;
	}
	String GetName() {
		return name;
	}
	void SetRole(String role) {
		this.role = role;
	}
	String GetRole() {
		return role;
	}
	//Function for add actor
	abstract void AddActor (String name, String role);
	//Function for upgrade info about actor
	abstract void UpgradeActor (String name);
	//Function for delete actor 
	abstract void DeleteActor (String name);
	//Function for print database of actor
	abstract void PrintAll ();
	//Function for print actors who have played in more than one movie
	abstract void PrintAllMore ();
}
