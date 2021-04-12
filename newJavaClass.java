
public class newJavaClass {
	public newJavaClass(int num) {
		// this is a constructor which accepts only one parameter, num
		System.out.print("Room number: " + num);
	}
	
	public static void main(String[] args) {
		// this is new object newJavaClass
		new newJavaClass(1);
	}
}
