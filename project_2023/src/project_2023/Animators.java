package project_2023;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Animators<T> extends People{
	
	List<Animators> listOfAnimators = new ArrayList<Animators>();	
	Animators (String name, Roles role){
		super(name, role);
	}	
	@Override
	void AddActor(String name) {
		listOfAnimators.add(new Animators(name, Roles.ANIMATOR));
	}
	@Override
	void DeleteActor(String name) {
		for (int i = 0; i < listOfAnimators.size(); i++) {
			if (listOfAnimators.get(i).GetName() == name) {
				listOfAnimators.remove(i);
			}
		}
	}
	public void Sort() {
		Collections.sort(listOfAnimators, Comparator.comparing(Animators::GetName));
	}
	@Override
	void PrintAll() {
		// TODO Auto-generated method stub	
		Sort();
		System.out.println("All Actors: ");
		for (int i = 0; i < listOfAnimators.size(); i++) {
		System.out.println(listOfAnimators.get(i).toString());
		}
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (GetRole() + ": " + GetName());
	}


}
