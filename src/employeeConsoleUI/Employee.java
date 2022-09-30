package employeeConsoleUI;

public class Employee {
	
	// fields
	int id;
	String name;
	int salary;
	int workHours;
	int hireYear;

	public Employee(int id, String name, int salary, int workHours, int hireYear) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}	
	
	public Employee() {
		
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWorkHours() {
		return workHours;
	}


	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}


	public int getHireYear() {
		return hireYear;
	}


	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// operations
	
	public void tax() {
		
		int salary = this.salary;
		double tax;
		
		
		if(salary >= 1000) {
			tax = 1000 * 0.03;
		} 
		else {
			tax = 0;
		}
		
		System.out.println(tax);
		
	}
	
	
	public void bonus() {
		int workHours = this.workHours;
		int bonus;
		
		if(workHours > 40) {
			int difference = workHours - 40;
			bonus = difference * 30;
			System.out.println("Bonus: " + bonus);
		}
		
	}
	
	public void raiseSalary() {
		int currentYear = 2021;
		int differenceOfYear = currentYear - this.hireYear;
		
		if(differenceOfYear < 10) {
			setSalary(this.salary += this.salary*0.05);
		}
		else if(differenceOfYear > 10 && differenceOfYear < 20) {
			setSalary(this.salary += this.salary*0.1);			
		}
		
		System.out.println(getSalary());
		
	}
	

}
