import java.time.LocalDate;

public class Employee {
	
	//data members ,variables ,state,fields,properties
	private int emp_no;
	private String name;
	private double salary;
	private LocalDate dateOfJoining;
	
	public static final String companyName;
	
	static {
		companyName="pratiti";
	}
	
	//constructor(s)
	public Employee()
	{
		
	}
	
	public Employee(int emp_no, String name, double salary, LocalDate dateOfJoining) {
		this.emp_no = emp_no;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	//getters and setters
	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
