package my_packages;

public class Assignment2 {
	public static void main(String[] args) {
		int numArray[];
		numArray = new int[9];
		int sum = 0;
		
		for(int i = 0; i < numArray.length;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
