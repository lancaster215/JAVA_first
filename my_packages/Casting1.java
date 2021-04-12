package my_packages;

public class Casting1 {
	public static void main(String [] args) {
		double d = 100.4;
		long l = (long)d; //explicit type casting is required
		int i = (int)l; //explicit type casting is required
		
		System.out.println("Double: " + d);
		System.out.println("Long: " + l);
		System.out.println("Integer: " + i);
	}
}
