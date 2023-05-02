package project_2023;

public class Directors extends People{
	Directors (String name, Roles role){
		super(name, role);
	}

	@Override
	void AddActor(String name) {
	}
	@Override
	void DeleteActor(String name) {
	}

	@Override
	void PrintAll() {		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Director: " + GetName());
	}
	
	
	

}
