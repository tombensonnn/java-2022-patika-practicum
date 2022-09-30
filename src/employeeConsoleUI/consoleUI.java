package employeeConsoleUI;

public class consoleUI {

	public static void main(String[] args) {
		
		// Ön açıklama: Normal şartlar altında field tutan class'ın içerisine operasyonların
		// yazılmaması gerektiğini düşünüyorum. Fakat case details kısmında bu şekilde 
		// belirtildiğinden dolayı belirtildiği gibi uygulamış bulundum.
		
		
		Employee employee = new Employee();
		
		employee.setId(1);
		employee.setName("can");
		employee.setSalary(2500);
		employee.setWorkHours(42);
		employee.setHireYear(2019);
		
		employee.tax();
		employee.bonus();
		employee.raiseSalary();
		
	}

}
