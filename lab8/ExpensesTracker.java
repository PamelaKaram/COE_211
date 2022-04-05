import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
	  	File file = new File("expenses.txt");
	  	FileWriter input = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(input);
		PrintWriter pw = new PrintWriter(bw);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your name: ");
		String name = sc.nextLine();
		
		String continuee = "y";
		
		// Start gathering information inside the loop you will start
		while(continuee.equals("y")) {
			
			System.out.println("What did you purchase?");
			String purchase = sc.nextLine();
			

			System.out.println("How much did you pay? (in USD)");
			Double amount = sc.nextDouble();
			
			sc.nextLine();
			
			pw.append(name + " purchased " + purchase +  " for " + amount + " US Dollars. ");
		
			System.out.println("Would you like to log another purchase? (y/n)");
			continuee = sc.nextLine();
			
			if(continuee.equals("n"))
				System.out.println("Get off of ZoodMall!");
		}
      // Close ClassWriter & Scanner objects
		pw.close();
		
		String summary = null;
		if(continuee.equals("n")){
			System.out.println("Would you like to read a summary of your purchases?");
			summary = sc.nextLine();
		}
		sc.close();
		
		if(summary.equals("y")) {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		}
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}