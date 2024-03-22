package sakila.exception;
//import java.lang.Exception;

public class FilmException extends RuntimeException{
	
	private String msg;
	public FilmException() {
		super();
		
	}
	
	public FilmException(String msg) {
		super(msg);
	}
	
	
}
