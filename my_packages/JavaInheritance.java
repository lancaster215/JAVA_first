package my_packages;

class JavaInheritance {
	int number;
	String name;

	void attr() {
		System.out.println("Number :" + number);
		System.out.println("Name :" + name);
	}
}
// this is the subclass which extends the class named JavaInheritance
class InheritedClass extends JavaInheritance{
	String work;
	int employee_number;
	
	void attrInherit() {
		System.out.println("Number : " + number);
		System.out.println("Name :" + name);
		System.out.println("Work :" + work);
		System.out.println("Employee Number :" + employee_number);
	}

	public static void main(String[] args) {
		InheritedClass i1 = new InheritedClass();
		
		i1.number = 23;
		i1.name = "Franco";
		i1.work = "Backend Developer";
		i1.employee_number = 306;
//		i1.attr();
		i1.attrInherit();
	}
}