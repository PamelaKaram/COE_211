import java.util.Scanner; 
public class Calculator {
	private int num1;
	private int num2;
    	private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
	
	Scanner scanCalc = new Scanner(System.in);
	
	System.out.print("Input the first number: ");
	num1 = scanCalc.nextInt();
	
	System.out.println("Input the operator: " );
	operator = scanCalc.nextString();	
	
	System.out.println("Input the second number: ");
	num2 = scanCalc.nextInt();

   
      switch(operator){
		case "+":
			System.out.println(add(num1,num2));
			break;
			
		case "-":
			System.out.println(subtract(num1,num2));
			break;
		
		case "*": 
			System.out.println(mutiply(num1,num2));
			break;
	
		
	      	case "/": 
		      	System.out.println(divide(num1,num2));
		      	break;
		    
	      	default:

			System.out.println("please enter a correct operator");
    }
		
		
	
    }

    public String add(int a, int b) {
       
	  return num1 + num2;
    }

    public String subtract(int a, int b) {
       
	  return num1 - num2;
    }

    public String multiply(int a, int b) {
       
	  return num1 * num2;
    }

    public String divide(int a, int b) {
      
	  return num1 / num2;
    }
}
