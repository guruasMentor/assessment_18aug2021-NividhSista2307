package userInterface;

import java.util.*;

import model.Player;
import playerRepository.FootballControllerFactory;
import playerRepository.FootballControllerInterface;

//This Class takes in the input and is the view layer essentially
public class FootballView {
	public FootballView() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ss = "y";
		while (ss.equals("y")) {
			System.out.println("Welcome! Please select the action you want to perform");
			System.out.println("Press 1 to Add players to the Repository");
			System.out.println("Press 2 to Form team");
			int s = sc.nextInt();

			FootballControllerInterface fc = FootballControllerFactory.createObject();
			switch (s) {

			case 1:
				fc.addPlayer();
				break;
			case 2:
				Player[] players = fc.formTeam();
			}
			System.out.println("Do you want to continue y/n?");
			ss = sc.next();
		}
	}
}
