
public class Student {
	int id;
	String name;
	static String from = "Bicol University";
	//static variables can be applied to instance variables and methods also
	
	String university = from;
	
	//this is a defined constructor. If there is no constructor, a default constructor is made.
	Student(int i, String x){
		id = i;
		name = x;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + from);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1001, "John");
		Student s2 = new Student(2002, "Eric");
		
		s1.display();
		s2.display();
	}
}
