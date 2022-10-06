package employeeConsoleUI;

public class Employee {
	
	// fields
	int id;
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(int id, String name, double salary, int workHours, int hireYear) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}	
	
	public int getId() {
		return id;
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
	
	
	
	// operations
	
	public double tax() {
		
		double salary = this.salary;
		double tax;
		
		
		if(salary >= 1000) {
			tax = 1000 * 0.03;
		} 
		else {
			tax = 0;
		}
		
		return tax;
		
	}
	
	
	public int bonus() {
		int workHours = this.workHours;
		int bonus = 0;
		
		if(workHours > 40) {
			int difference = workHours - 40;
			bonus = difference * 30;
		}
		return bonus;
		

		
	}
	
	public double raiseSalary() {
		int currentYear = 2021;
		int differenceOfYear = currentYear - this.hireYear;
		double tax = this.tax();
		int bonus = this.bonus();
		double salary = getSalary();
		
		
		if(differenceOfYear < 10) {
			//setSalary(this.salary*0.05 + bonus - tax);
			salary = salary + salary*0.05 + bonus - tax;
		}
		else if(differenceOfYear > 9 && differenceOfYear < 20) {
			//setSalary(this.salary*0.1 + bonus - tax);	
			salary = salary + salary*0.1 + bonus - tax;
		}
		else if(differenceOfYear > 19) {
			//setSalary(this.salary*0.15 + bonus - tax);
			salary = salary + salary*0.15 + bonus - tax;
		}
		
		return salary;

	}
	
	public String toString()
	{
		 return
				 "Çalışanın İsmi: " + getName() +
				 "\nÇalışanın Maaşı: " + this.raiseSalary() + 
				 "\nÇalışanın Haftalık Çalışma Saati: " + getWorkHours() +
				 "\nÇalışanın İşe Başlangıç Yılı: " + getHireYear();
				 
	}



	

}
