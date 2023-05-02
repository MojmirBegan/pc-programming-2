package project_2023;
//Class for Actors, Animators, Directors
public abstract class People {
	private String name;
	
	private Roles roles;
	//Common constructor
	People (String name, Roles roles){
		this.name = name;		
		this.roles= roles;
	}
	//Getters and Setters
	void SetName(String name) {
		this.name = name;
	}
	String GetName() {
		return name;
	}		
	void SetRole(Roles roles) {
		this.roles = roles;
	}
	Roles GetRole() {
		return roles;
	}	
	//Function for add actor
	abstract void AddActor (String name);	
	//Function for delete actor 
	abstract void DeleteActor (String name);
	//Function for print database of actor
	abstract void PrintAll ();	
	public abstract String toString();
}
