package my_packages;

public class CastingObjects {
	public static void main(String [] args) {
		String value = "cat";
		Object temp = value;
		String value2 = (String)temp;
		
		System.out.println(value2);
	}
}
