/**
 * SmallErrorData contains the necessary components of an Error and stores them
 * in private fields.
 * 
 * @author Jeff W
 */
public class SmallErrorData implements ErrorData {
	private int lineNumber;
	private int errorCode;
	private String errorMessage;
	
	//Default constructor which sets values to useless numbers.
	public SmallErrorData() {
		this.lineNumber = 0;
		this.errorCode = 0;
		this.errorMessage = null;
	}
	
	//Constructor that functions in the same way as the add method really,
	//but since it's already documented I'm not going to redact it yet.
	public SmallErrorData(int lineNumber, int errorCode, String errorMessage) {
		this.lineNumber = lineNumber;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	@Override
	public void add(int lineNumber, int errorCode, String errorMessage) {
		this.lineNumber = lineNumber;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	@Override
	public int getLineNumber() {
		//Copy the value to retain this.lineNumber's immutability.
		int immutableCopy = this.lineNumber;
		return immutableCopy;
	}

	@Override
	public int getErrorCode() {
		//Copy the value to retain this.errorCode's immutability.
		int immutableCopy = this.errorCode;
		return immutableCopy;
	}

	@Override
	public String errorMessage() {
		//Strings are immutable already.
		return this.errorMessage;
	}

}
