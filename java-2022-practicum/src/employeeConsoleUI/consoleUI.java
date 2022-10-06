package employeeConsoleUI;

public class consoleUI {

	public static void main(String[] args) {
		
		// Ön açıklama: Normal şartlar altında field tutan class'ın içerisine operasyonların
		// yazılmaması gerektiğini düşünüyorum. Fakat case details kısmında bu şekilde 
		// belirtildiğinden dolayı belirtildiği gibi uygulamış bulundum.
		
		
		Employee employee = new Employee(1,"Can Uyumaz", 2500, 43, 2000);
		System.out.println(employee.toString()); 
		
	}

}
