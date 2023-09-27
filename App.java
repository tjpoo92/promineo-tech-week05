package week05codingassignment;

public class App {

	public static void main(String[] args) {
		
		String testString = "Hello";
		
		AsteriskLogger testAsteriskLog = new AsteriskLogger();
		AsteriskLogger testAsteriskError = new AsteriskLogger();
		
		testAsteriskLog.log(testString);
		testAsteriskError.error(testString);
		
		SpacedLogger testSpacedLog = new SpacedLogger();
		SpacedLogger testSpacedError = new SpacedLogger();
		
		testSpacedLog.log(testString);
		testSpacedError.error(testString);
		
		

	}

}
