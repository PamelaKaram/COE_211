import java.util.Scanner;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	private int age;
    

public Employee(){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please input the employee's first name: ");
	firstName = scan.nextLine();
	
	System.out.println("Please input the employee's last name: ");
	lastName= scan.nextLine();

	
	
	System.out.println("Please input the employees age: ");
	age = scan.nextInt();

	System.out.println("Please input the employee's salary: ");
	salary = scan.nextInt();

    }

    public String toString(){
        return "Employee information: "+firstName +", " +lastName + ", " +age + ", " +salary;
    }
}