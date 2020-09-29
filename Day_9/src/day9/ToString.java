package day9;

class Employee{
	
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId +" "+empName;
	}
	
	
	
}

public class ToString {

	public static void main(String[] args) {
		
		Employee e = new Employee(88, "Sanjit");
		
		System.out.println(e);

	}

}
