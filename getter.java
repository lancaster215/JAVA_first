class Person {
	String name;
	int age;
	String work;
	
	String name () {
		return name;
	}
	
	String workIn () {
		return work;
	}
	
	int age () {
		return age;
	}
}
public class getter {
	public static void main(String[] args) {
		Person background = new Person();
		background.age = 23;
		background.name = "Franco";
		background.work = "Frontend Developer";
		
		System.out.println("My name is " +background.name()+".");
		System.out.println("I work as a "+background.workIn()+ ".");
		System.out.println("I am already "+background.age()+" years old.");
	}
}
