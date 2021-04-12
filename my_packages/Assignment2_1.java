package my_packages;

import java.util.Scanner;

public class Assignment2_1 {
	static int sumMethod() {
		System.out.println("Input the size of the array: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int numArray[] = new int[size];
		int sum = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			sum += i;
		}
		s.close(); //scanner varaible must be closed
		return sum;
	}
	
	public static void main(String [] args) {
		System.out.println(sumMethod());
	}
	
}
