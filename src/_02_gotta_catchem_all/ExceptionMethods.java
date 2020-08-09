package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double divide(double dividend, double divisor) {
		if (divisor == 0.0) {
			throw new IllegalArgumentException("divisor cannot be 0.0");
		}
		double quotient = dividend/divisor;
		return quotient;
	}
	
	String reverseString(String string) {
		if (string.equals("")) throw new IllegalStateException();
		
		return new StringBuilder(string).reverse().toString();
	}
}
