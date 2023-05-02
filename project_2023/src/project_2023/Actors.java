package project_2023;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Actors<T> extends People{	
	List<Actors> listOfActors = new ArrayList<Actors>();	
	Actors (String name, Roles role){
		super(name, role);
	}	
	@Override
	void AddActor(String name) {
		listOfActors.add(new Actors(name, Roles.ACTOR));
	}
	@Override
	void DeleteActor(String name) {
		for (int i = 0; i < listOfActors.size(); i++) {
			if (listOfActors.get(i).GetName() == name) {
				listOfActors.remove(i);
			}
		}
	}
	public void Sort() {
		Collections.sort(listOfActors, Comparator.comparing(Actors::GetName));
	}
	@Override
	void PrintAll() {
		// TODO Auto-generated method stub	
		Sort();
		System.out.println("All Actors: ");
		for (int i = 0; i < listOfActors.size(); i++) {
		System.out.println(listOfActors.get(i).toString());
		}
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (GetRole() + ": " + GetName());
	}

}
