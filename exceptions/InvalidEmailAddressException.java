package exceptions;

public class InvalidEmailAddressException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid input for email address";
	}

}
