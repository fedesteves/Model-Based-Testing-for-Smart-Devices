package exception;

public class Error extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	
	public Error(String message)
	{
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
	
}
