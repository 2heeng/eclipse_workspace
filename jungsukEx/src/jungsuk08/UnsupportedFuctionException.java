package jungsuk08;

public class UnsupportedFuctionException extends RuntimeException {

	final private int ERR_CODE;

	public UnsupportedFuctionException(String message, int code) {
		super(message);
		ERR_CODE = code;
	}

	public UnsupportedFuctionException(String message) {
		this(message, 100);
	}

	public int getErrorCode() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {

		return "[" + getMessage() + "]" + super.getMessage();

	}
}
