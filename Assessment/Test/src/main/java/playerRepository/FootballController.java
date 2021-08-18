package playerRepository;

import java.util.*;

import exceptions.TeamNotFormedException;
import model.Player;

public class FootballController implements FootballControllerInterface {
	static Player[] players = new Player[20];
	static int pCount;
	Scanner sc = new Scanner(System.in);

	public void addPlayer() {// addPlayer() method to add players into the database

		System.out.println("Enter the player's SNo");
		int sNo = sc.nextInt();
		System.out.println("Enter the name of the player");
		String name = sc.next();
		System.out.println("Enter the category of the player");
		String category = sc.next();
		System.out.println("Enter the Rank of the player");
		int rank = sc.nextInt();

		// Creating an player object with the input given by the user
		Player pl = new Player();
		pl.setsNo(sNo);
		pl.setName(name);
		pl.setCategory(category);
		pl.setRank(rank);
		System.out.println("Player has been added to the database");
	}

	@Override
	public Player[] formTeam() throws TeamNotFormedException {
		// wasn't able to finish this method
		return null;
	}

}
