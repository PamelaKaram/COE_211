import java.util.Scanner;

public class EntryPoint {
	
	public static void main(String[] args){
	
	int rand = (int)(Math.random() * 10 + 1);
		
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Please input employee's first name: ");
	String firstName = scan.nextLine();
	
	System.out.println("Please input the employee's last name: ");
	String lastName = scan.nextLine();

	System.out.println("Please input the employee's age: ");
	int age = scan.nextInt();

	System.out.println("Please input the employee's monthly salary: ");
	double monthlySal = scan.nextDouble();
	

	}
	
		

	Employee x = new Employee(firstName, lastName, age, monthlySal); 
	System.out.println("Employee information: " + x.firstName+ " " +x.lastName + ", " + x.age + ", " + x.monthlySal);
	
	
	}
}