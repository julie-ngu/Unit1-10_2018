/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program has an enum that holds the positions and names of the planets
 * 		in our solar system.
 * 
 ****************************************************************************/

import java.util.Scanner;

public class Planets {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		for(PlanetsInfo planetName : PlanetsInfo.values()) {
			System.out.println(planetName);
		}
		
		System.out.print("\nWhat planet would you like to visit? ");
		String userPlanet = userInput.nextLine();
		
		PlanetsInfo userChoice = PlanetsInfo.valueOf(userPlanet.toUpperCase());
		
		switch(userChoice) {
		
		case MERCURY :
			System.out.print("You have chosen " + PlanetsInfo.MERCURY + ", the " + PlanetsInfo.MERCURY.position + "st planet in our solar system.\n");
			break;
		case VENUS :
			System.out.print("You have chosen " + PlanetsInfo.VENUS + ", the " + PlanetsInfo.VENUS.position + "nd planet in our solar system.\n");
			break;
		case EARTH :
			System.out.print("You have chosen " + PlanetsInfo.EARTH + ", the " + PlanetsInfo.EARTH.position + "rd planet in our solar system.\n");
			break;
		case MARS :
			System.out.print("You have chosen " + PlanetsInfo.MARS + ", the " + PlanetsInfo.MARS.position + "th planet in our solar system.\n");
			break;
		case JUPITER :
			System.out.print("You have chosen " + PlanetsInfo.JUPITER + ", the " + PlanetsInfo.JUPITER.position + "th planet in our solar system.\n");
			break;
		case SATURN :
			System.out.print("You have chosen " + PlanetsInfo.SATURN + ", the " + PlanetsInfo.SATURN.position + "th planet in our solar system.\n");
			break;
		case URANUS :
			System.out.print("You have chosen " + PlanetsInfo.URANUS + ", the " + PlanetsInfo.URANUS.position + "th planet in our solar system.\n");
			break;
		case NEPTUNE :
			System.out.print("You have chosen " + PlanetsInfo.NEPTUNE + ", the " + PlanetsInfo.NEPTUNE.position + "th planet in our solar system.\n");
			break;
		}
	}
	
	public enum PlanetsInfo {
		MERCURY(1),
		VENUS(2),
		EARTH(3),
		MARS(4),
		JUPITER(5),
		SATURN(6),
		URANUS(7),
		NEPTUNE(8);
		
		private final int position;
		
		private PlanetsInfo(int position) {
			this.position = position;
		}
	}
}
