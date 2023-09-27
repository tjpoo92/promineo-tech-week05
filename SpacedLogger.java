package week05codingassignment;

public class SpacedLogger implements Logger {

	public SpacedLogger() {}
	
	public void log(String log) {
		StringBuilder sb = new StringBuilder();
		char[] temp = log.toCharArray();
		
		for (char c : temp) {
			sb.append(c);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());				
	}

	
	public void error(String log) {
		StringBuilder sb = new StringBuilder();
		char[] temp = log.toCharArray();
		sb.append("Error:");
		
		for (char c : temp) {
			sb.append(c);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());		
	}

}
