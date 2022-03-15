import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args) {
	
	int num;
	
	
	Scanner scan = new Scanner(System.in);
	
	String confirm="y";

	while(confirm.equals("y")){
	System.out.println("Which service would you like to use?");
	num = scan.nextInt();
	switch(num){
		case 1: 
			BasicWeek basic = new BasicWeek();
			basic.printDays();
			break;
		
		case 2:
			AdvancedWeek adv = new AdvancedWeek();
			adv.printDays();
			break;
		
		case 3:
			Calculator calc = new Calculator();
			break;
	
		case 4:
			Employee emp = new Employee();
			System.out.println(emp);
			break;
		default:
			System.out.println("Please make sure you pick a number between 1 and 4");
		
		}
	
	System.out.println("Would you like to perform another operation? (y/n)");	
	scan.nextLine();
	confirm = scan.nextLine();
	
	}


	}
}
		