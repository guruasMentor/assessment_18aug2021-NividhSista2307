package exceptions;

@SuppressWarnings("serial")
public class TeamNotFormedException extends RuntimeException {
	TeamNotFormedException(String s) {
		super(s);
	}
}
