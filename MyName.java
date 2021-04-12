//import java.util.Scanner;
import java.io.*;

public class MyName {
	public static void main(String [] args) {
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			System.out.print("Please Enter your name:");
			
			String name = br.readLine();
			
			System.out.format("Hello, %s!%n", name);
		}catch (IOException ioe){
			System.out.println("IO Exception raised!");
		}
	}
}
