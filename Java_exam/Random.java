package Java_exam;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
//import java.lang.Integer;
//import java.util.Collections;

public class Random {
	
	public ArrayList<Integer> orderAsc(ArrayList<Integer> num, int max) {
		int temp;
		
		for(int i = 0; i < num.size();i++) {
			for(int j = i+1; j < num.size(); j++) {
				if(num.get(i) > num.get(j)) {
					temp = num.get(i);
					num.set(i, num.get(j));
					num.set(j, temp);
				}
			}
		}
		return num;
	}
	
	public ArrayList<Integer> orderDesc(ArrayList<Integer> num, int max){
		int temp;
		for(int i = 0; i < num.size();i++) {
			for(int j = i+1; j < num.size(); j++) {
				if(num.get(i) < num.get(j)) {
					temp = num.get(i);
					num.set(i, num.get(j));
					num.set(j, temp);
				}
			}
		}
		return num;
	}
	
	public int setMax(ArrayList<Integer> num) {
		int max = num.get(0);
		for(int i = 0; i<num.size(); i++) {
			if(max < num.get(i)) max = num.get(i);
		}
		return max;
	}
	
	public int setMin(ArrayList<Integer> num, int inputNum) {
		int min = num.get(inputNum - 1);
		for(int i = 0; i < num.size(); i++) {
			if(min > num.get(i)) min = num.get(i);
		}
		return min;
	}
	
	public ArrayList<Integer> toFibonacci(ArrayList<Integer> num, int max) {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		
		Random c = new Random();
		ArrayList<Integer> sorted = c.orderAsc(num, max);
		
		fib.add(sorted.get(0));
		fib.add(sorted.get(1));
		for(int i = 2; i < sorted.size(); i++) {
			fib.add(fib.get(i-2) + fib.get(i - 1));
		}
		
		return fib;
	}
	
	public void toDiamond(ArrayList<Integer> num, ArrayList<Integer> num2, int max) {
		int[] firstHalf = null;
		int[] secondHalf = null;
		
		for(int x = 0; x <= max-1; x++) {
			for(int z = 1; z <= max-x; z++) {
				System.out.print(" ");
			}
			secondHalf = new int[x*2];
			for(int z = 0; z <= secondHalf.length; z++) {
				System.out.print(num2.get(x));
			}
			System.out.print("\n");
		}
		
		for(int x = max-2; x >= 0; x--) {
			for(int z = 1; z <= max-x; z++) {
				System.out.print(" ");
			}
			firstHalf = new int[x*2];
			for(int z = 0; z <= firstHalf.length; z++) {
				System.out.print(num.get(x));
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String [] args) {
		System.out.println("Input a number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int min = 1;
		int range = (num - min) + 1;
		ArrayList<Integer> toSortNumbers = new ArrayList<Integer>();
		Random c = new Random();
		
		for(int i = 0; i<num;i++) {
			toSortNumbers.add((int)(Math.random() * range) + min);
		}
		System.out.println("Random Numbers: " + toSortNumbers);
		
		System.out.println("Sort random numbers to ascending order: " + c.orderAsc(toSortNumbers, num));
		
		System.out.println("Sort random numbers to descending order: " + c.orderDesc(toSortNumbers, num));
		
		System.out.println("The highest number among the random numbers is: " + c.setMax(toSortNumbers));
		
		System.out.println("The lowest number among the random numbers is: " + c.setMin(toSortNumbers, num));
		
		System.out.println("The fibonacci sequence is: " + c.toFibonacci(toSortNumbers, num));
		
		c.toDiamond(toSortNumbers, c.orderDesc(toSortNumbers, num), num);
		s.close();
	}
}
