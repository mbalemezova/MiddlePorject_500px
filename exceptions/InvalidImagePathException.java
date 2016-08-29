package exceptions;

public class InvalidImagePathException extends Exception {
	
	@Override
	public String getMessage() {
		return "Invalid image path";
	}

}
