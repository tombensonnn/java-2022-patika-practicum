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
			this.salary += this.salary*0.05;
		}
		else if(differenceOfYear > 9 && differenceOfYear < 20) {
			this.salary += this.salary*0.1;			
		}
		else if(differenceOfYear > 19) {
			this.salary += this.salary*0.15;
		}
		
		System.out.println(this.salary);
		
	}
	
	public String toString()
	{
		 return
				 "Çalışanın İsmi: " + this.name +
				 "\nÇalışanın Maaşı: " + this.salary + 
				 "\nÇalışanın Haftalık Çalışma Saati: " + this.workHours +
				 "\nÇalışanın İşe Başlangıç Yılı: " + this.hireYear;
				 
	}

}
