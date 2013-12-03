package zweiDimensionaleGeometrie;

import java.util.Scanner;

import rechner.Validation;
import static java.lang.Math.sqrt;


public class Formel {
	
	public static void mitternachtsformel(){
		
		// x1,2 = -b +- (sqrt (b² - 4ac)) / 2a
	    
	    System.out.println(" - Quadratic formula - ");
	    System.out.println("\n");
	    System.out.println("Instructions: You'll be asked to enter your a, b, and");
	    System.out.println("c value.");
	    System.out.println("\n");
	    
	        
	    String aa = null;
	    double a = 0D;
	    double b = 0D;
	    double c = 0D;
	    double discriminant = 0D;
	    double xOne = 0D;
	    double xTwo = 0D;
	    
	    //NewClass1 Check = new NewClass1();
	    
	    Scanner userInput = new Scanner (System.in);
	    
	    
	    
	    	
	    do{
	   		System.out.print("Enter A: ");
	   	    aa = userInput.next();
	   	    a = Validation.checkEingabeDouble(aa);
	    	if (a == Double.MIN_VALUE){
	    		System.out.println("Bitte geben sie eine Zahl im Zahlenformat ein.");
	    	}
	    		
	    }while(a == Double.MIN_VALUE);
	    
	    System.out.print("Enter B: ");
	    b = userInput.nextDouble();
	    
	    System.out.print("Enter C: ");
	    c = userInput.nextDouble();
	    
	    if(a != Double.MIN_VALUE){
		    discriminant = (b * b) - 4 * a * c;
		    
		        if (discriminant < 0) {
		            System.out.println("\n");
		            
		            System.out.println("Error, your discriminant is: " + discriminant);
		            System.out.println("\n\n\n");
		        }
	
		        else {
		            xOne = (-b + sqrt(discriminant)) / (2 * a);
		            xTwo = (-b - sqrt(discriminant)) / (2 * a);
		            
		            System.out.println("\n");
		            
		            System.out.println("X1 is: " + xOne);
		            System.out.println("X2 is: " + xTwo);
		            System.out.println("Your discriminant is: " + discriminant);
		            System.out.println("\n\n\n");
		        }
	    }else{
	    	System.out.println("\n");
	    	
	    }
		
	}

}
