import java.util.Scanner;
import java.text.DecimalFormat;

public class lab9 {
    public static void main(String[] args) {
        // Initialize array of integers
		Scanner sc = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");		

		int [] grades = new int[5];
		int lab = 0;
		int midterm = 0;	
		int sumgrades = 0;
		

		double result1, result2 , result3, cw ;
	
        // for loop to get user input & store in array
		
		for ( int i = 0; i < grades.length ; i++){
			System.out.println("Input the grade for assignment " + (i+1));
			grades[i]= sc.nextInt();}

		System.out.println("Input the number of attended labs.");
		lab = sc.nextInt();
		
		System.out.println("Input the midterm grade.");
		midterm = sc.nextInt();
		
		
		
        // for loop to iterate over the array & perform calculations
		
		
		for ( int j = 0; j < grades.length ; j++){
			sumgrades += grades[j];
			
 			}
			cw = sumgrades / 5.0;
			result1 = 0.3 * cw;
			result2 = (lab * 100 * 0.05)/7.0;
			result3 = 0.3 * midterm;
		
		
			  
        // display output to user
		System.out.println("Assignmnents (30%): " + fmt.format(result1));
		System.out.println("Attendance (5%): " + fmt.format(result2));
		System.out.println("Midterm (30%): " + fmt.format(result3));
    }
}