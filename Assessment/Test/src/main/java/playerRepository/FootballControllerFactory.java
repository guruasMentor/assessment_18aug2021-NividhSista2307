package playerRepository;

public class FootballControllerFactory {// factory to create FootballCOntroller object

	public static FootballControllerInterface createObject() {
		FootballControllerInterface fci = new FootballController();
		return fci;

	}

}
