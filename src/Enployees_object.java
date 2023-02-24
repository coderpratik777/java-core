import java.time.LocalDate;

public class Enployees_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee person1=new Employee(1001,"pratik",10000,LocalDate.of(2023, 01, 23));
		
		
		System.out.println(person1.getEmp_no());
		System.out.println(person1.getName());
		System.out.println(person1.getDateOfJoining());
		
		Employee person2=new Employee ();
		person2.setName("sarthak");
		person2.setSalary(10000);
		person2.setEmp_no(1002);
		
		

	}

}
