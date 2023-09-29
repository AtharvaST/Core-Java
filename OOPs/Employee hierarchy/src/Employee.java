
class Employee {
	private int id;
	private String name;
	
	public Employee( int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void displayInfo() {
		
		System.out.println("Employee ID is :" + id);
		System.out.println("Employee Name is :" +name);
	}
}

class Manager extends Employee{
	private int  teamSize;

	public Manager(int id, String name, int teamSize) {
		super(id, name);
		this.teamSize=teamSize;
		
	}
	
	@Override
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("Manager's Teamsize is:" + teamSize);
	}
	
}

class Developer extends Employee{
	
	private String programmingLanguage;
	
	public Developer(int id,String name ,String programmingLanguage) {
		super(id,name);
		this.programmingLanguage=programmingLanguage;
	}
	
public void displayInfo() {
		
		super.displayInfo();
		System.out.println("Developers Programming Language is:" + programmingLanguage);
}
}
class EmployeeHierarchyInfo{

	public static void main(String[] args) {
		
		Employee e = new Employee(100,"xyz");
		Manager m = new Manager(101,"abc",10);
		Developer d = new Developer(102,"Atharva","Java");
		
		System.out.println("Employee Info:");
		e.displayInfo();
		System.out.println();
		
		System.out.println("Manager's Info:");
		m.displayInfo();
		System.out.println();
		
		System.out.println("Developers Info:");
		d.displayInfo();
	}
	
	
}
