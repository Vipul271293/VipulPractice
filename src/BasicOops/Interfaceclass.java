package BasicOops;

public class Interfaceclass implements EmployeeDetails,EmployeeSalarymaster{

	public static void main(String[] args) {
		
		
		EmployeeDetails a = new Interfaceclass();
		a.Employeeage();
		a.Employeename();
		
		Interfaceclass v= new Interfaceclass();
		v.Employeename();
		v.Employeedepartment();
		
		EmployeeSalarymaster b = new Interfaceclass();
		b.Mothlysalary();
		
		System.out.print(true);
	}

	@Override
	public void Employeeage() {
		// TODO Auto-generated method stub
		
		System.out.println("Age 28");
		System.out.println("Age 30");
	}

	@Override
	public void Employeename() {
		// TODO Auto-generated method stub
		
		System.out.println("Vipul Patel");
	}
	
	public void Employeedepartment()
	{
		System.out.println("Computer");
		
	}

	@Override
	public void Mothlysalary() {
		// TODO Auto-generated method stub
		System.out.println("Monthly salary is:10");
		
	}

}
