/*
 * Author: Mojmír Begán
 * ID : 205 895
 * Faculty: FEKT-BPC-TLI
*/
package project_2023;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
//Movie register, main file
public class Mregister {
	public static int OnlyInteger(Scanner sc) {
		int number = 0;
		try {
			number = sc.nextInt();
		}
		catch(Exception e){
			System.out.println("Error! Function OnlyInteger!");
			System.out.println("Enter only Integer");
			sc.nextLine();
			number = OnlyInteger(sc);
		}
		return number;
	}
	public static double OnlyNumber(Scanner sc) {
		double number = 0;
		try {
			number = sc.nextFloat();
		}
		catch(Exception e){
			System.out.println("Error! Function OnlyNumber!");
			System.out.println("Enter only Number");
			sc.nextLine();
			number = OnlyNumber(sc);
		}
		return number;
	}
	public static void main(String[] args) {		
		boolean run = true;
		int choice;		
		Actors jozef = new Actors("jozef", Roles.ACTOR);
		Actors peter = new Actors("peter", Roles.ACTOR);
		Actors pavol = new Actors("pavol", Roles.ACTOR);
		Actors filip = new Actors("filipf", Roles.ACTOR);
		Animators adam = new Animators("adam", Roles.ANIMATOR);
		Animators jakub = new Animators("jakub", Roles.ANIMATOR);
		Animators chris = new Animators("cris", Roles.ANIMATOR);
		Animators rudolf = new Animators("rudolf", Roles.ANIMATOR);
		Directors spielberg = new Directors("spielberg", Roles.DIRECTOR);
		Directors cameron = new Directors("cameron", Roles.DIRECTOR);
		Comments com1 = new Comments("Alex", "Bolo to fajn", 4.5);
		Comments com2 = new Comments("Jakub", "Super", 2);
		Comments com3 = new Comments("Anonym", "Kazdopadne...", 1.3);
		Comments com4 = new Comments("Alex", "Ale i tak,...", 3.5);
		List<Actors> listOfActors1 = new ArrayList<Actors>();
		listOfActors1.add(jozef);
		listOfActors1.add(pavol);
		List<Actors> listOfActors2 = new ArrayList<Actors>();
		listOfActors2.add(jozef);
		listOfActors2.add(peter);
		listOfActors2.add(filip);
		listOfActors2.add(pavol);
		List<Actors> listOfActors3 = new ArrayList<Actors>();			
		listOfActors3.add(peter);
		listOfActors3.add(filip);
		listOfActors3.add(pavol);
		List<Animators> listOfAnimators1 = new ArrayList<Animators>();
		listOfAnimators1.add(adam);
		listOfAnimators1.add(chris);
		List<Animators> listOfAnimators2 = new ArrayList<Animators>();		
		listOfAnimators2.add(adam);
		listOfAnimators2.add(jakub);
		listOfAnimators2.add(chris);
		listOfAnimators2.add(rudolf);	
		List<Comments> listOfComments1 = new ArrayList<Comments>();	
		listOfComments1.add(com1);
		listOfComments1.add(com2);
		List<Comments> listOfComments2 = new ArrayList<Comments>();
		listOfComments2.add(com1);
		listOfComments2.add(com3);
		List<Comments> listOfComments3 = new ArrayList<Comments>();
		listOfComments3.add(com1);
		listOfComments3.add(com2);
		listOfComments3.add(com3);
		listOfComments3.add(com4);
		List<Comments> listOfComments4 = new ArrayList<Comments>();
		listOfComments4.add(com1);		
		DbMovies pirates = new DbMovies("pirates", Genres.FANTASY, spielberg, 2002, listOfActors1, listOfComments1);
		DbMovies avatar = new DbMovies("avatar", Genres.SCIFI, cameron, 2009, listOfActors2, listOfComments2);
		DbCartoons naruto = new DbCartoons("naruto", Genres.ANIME, spielberg, 2013, listOfAnimators2, listOfComments3);
		DbCartoons onepiece = new DbCartoons("onepiece", Genres.FANTASY, cameron, 2015, listOfAnimators1, listOfComments4);
		DbMovies <DbMovies> movies = new DbMovies<DbMovies>();
		movies.AddMovie("pirates", Genres.FANTASY, spielberg, 2002, listOfActors1, listOfComments1);
		movies.AddMovie("avatar", Genres.SCIFI, cameron, 2009, listOfActors2, listOfComments2);
		DbCartoons <DbCartoons> cartoons = new DbCartoons<DbCartoons>();
		cartoons.AddMovie("naruto", Genres.ANIME, spielberg, 2013, listOfAnimators1, listOfComments3);
		cartoons.AddMovie("onepiece", Genres.FANTASY, cameron, 2015, listOfAnimators2, listOfComments4);
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("##############################################");
			System.out.println("Choose wanted option:");
			System.out.println("01) .. Add new Movie");
			System.out.println("02) .. Upgrade info about Movie, which is already in database.");
			System.out.println("03) .. Remove Movie");
			System.out.println("04) .. Print All Movies");
			System.out.println("05) .. Add comment to Movie");
			System.out.println("06) .. Print All Movies");
			System.out.println("07) .. Look for Movie");
			System.out.println("08) .. Print all Actors or Animators with more than one Movie");
			System.out.println("09) .. Print all Moviec with one same actor or animator.");
			System.out.println("10) .. End program.");
			System.out.println("##############################################");			
			choice = OnlyInteger(sc);
			switch(choice) {
				case 1:
					System.out.println("Enter only Number");
					break;
				case 2:
					System.out.println("Add new Movie");					
					break;
				case 3:
					System.out.println("Upgrade info about Movie, which is already in database.");
					
					break;
				case 4:
					System.out.println("Print All Movies");						
					System.out.println(pirates.toString());
					System.out.println(naruto.toString());
					System.out.println(onepiece.toString());
					System.out.println(avatar.toString());
					break;
				case 5:					
					System.out.println("Add comment to Movie");					
					break;
				case 6:					
					System.out.println("Print All Movies");	
					movies.PrintAll();
					cartoons.PrintAll();
					break;
				case 7:					
					System.out.println("Look for Movie");					
					break;
				case 8:
					System.out.println("Print all Actors or Animators with more than one Movie");					
					break;
				case 9:					
					System.out.println("Print all Moviec with one same actor or animator.");
					break;
				case 10:
					System.out.println("##############################################");
					System.out.println("Program was ended.");
					System.out.println("##############################################");
					run = false;
					break;
			}			
		}
	}

}
