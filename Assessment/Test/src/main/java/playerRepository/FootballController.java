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
		// Mentor Comment: You should validate the input,

		System.out.println("Enter the category of the player");

		// Mentor Comment: You should provide hint about what to be input by the user like goal keeper, Defender
		String category = sc.next();
		// Mentor Comment: You should validate the input, throw Exception object
		
		System.out.println("Enter the Rank of the player");
		int rank = sc.nextInt();
		// Mentor Comment: You should validate the input,rank should be above zero

		// Creating an player object with the input given by the user
		Player pl = new Player();
		pl.setsNo(sNo);
		pl.setName(name);
		pl.setCategory(category);
		pl.setRank(rank);

		// Mentor Comment: Player not added to a collection or array object
		System.out.println("Player has been added to the database");
	}

	@Override
	public Player[] formTeam() throws TeamNotFormedException {
		// wasn't able to finish this method
		return null;
	}

}
