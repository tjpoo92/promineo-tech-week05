package week05codingassignment;

public class AsteriskLogger implements Logger {

	public AsteriskLogger() {}
	
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	public void error(String log) {
		StringBuilder sb = new StringBuilder();
		String errorLog = "***Error:" + log + "***";
		for (int i = 0; i < errorLog.length(); i++) {
			sb.append('*');
		}
		
		System.out.println(sb);
		System.out.println(errorLog);
		System.out.println(sb);
		
	}

}
