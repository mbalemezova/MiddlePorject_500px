package exceptions;

public class NotSurePasswordException extends Exception{
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Password must be 5 or more symbols";
	}

}
