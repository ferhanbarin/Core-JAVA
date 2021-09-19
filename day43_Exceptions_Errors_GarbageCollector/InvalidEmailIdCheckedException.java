package day43_Exceptions_Errors_GarbageCollector;

public class InvalidEmailIdCheckedException extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidEmailIdCheckedException(String message) { // Parametreli Constructor olusturdum ki bu class'dan olusan Object ile class'dan ve parent'inden field ve variable call yapabilelim.
		
		super(message);
	}

}
