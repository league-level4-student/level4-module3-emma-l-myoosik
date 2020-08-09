package _01_introduction;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	public static void terminate() {
		System.exit(0);
	}
	
}
