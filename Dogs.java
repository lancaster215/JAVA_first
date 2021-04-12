//import java.util.Arrays;

public class Dogs {
	int age;
	String name;
	String breed;
	
	public String dogInfo() {
		return ("Dog name:" + name + "Dog breed:" + breed + "Dog age:" + age);
	}
	
	public static void main(String[] args) {
		Dogs aspin = new Dogs(); // aspin is the name of the object. new Dogs() refers to the class which is passed to aspin
		aspin.age = 2;
		aspin.name = "Maxiiii";
		aspin.breed = "Aspin";
		System.out.print(aspin.dogInfo());
	}
}
