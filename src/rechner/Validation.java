package rechner;

import java.util.Scanner;
import java.lang.Exception;

public class Validation {
	
	public static double checkEingabeDouble(String eingabe){
		double fertig = 0;
		try{
			/*
			boolean validation = false;
			Scanner userInput = new Scanner(System.in);
			if (userInput.hasNextDouble()) {
				validation = true;
			}
			*/
			fertig = Double.parseDouble(eingabe);
			
			return fertig;
			
		}catch(NumberFormatException s){
			fertig = Double.MIN_VALUE;
			return fertig;
		}
		
		
	}
	
	
	
	

}
