package my_packages;

public class Casting {
	public static void main(String [] args) {
		int num = 100;
		long l = num; //implicit type casting
		float f = l; //implicit type casting
		
		System.out.println("Integer: " + num);
		System.out.println("Long: " + l);
		System.out.println("Float: " + f);
	}
}
