package application.exceptions;

public class ClienteHttpException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ClienteHttpException(String message) {
        super(message);
    }

}
