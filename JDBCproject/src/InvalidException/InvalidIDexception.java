package InvalidException;

public class InvalidIDexception extends Exception {
	public InvalidIDexception() {
		super();
		}
	
	public InvalidIDexception(String message,Throwable cause, boolean enableSupperssion, boolean writableStackTrace) {
	super(message,cause,enableSupperssion,writableStackTrace);	

}

	public InvalidIDexception(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidIDexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidIDexception(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
