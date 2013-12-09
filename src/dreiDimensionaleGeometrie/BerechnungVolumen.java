package dreiDimensionaleGeometrie;

import zweiDimensionaleGeometrie.*;
import java.util.Scanner;

public class BerechnungVolumen{
	
	private static double grundflaecheKlasse;
	
	public static double berechneDreieckVolumen(double grundflaeche){
		grundflaecheKlasse = grundflaeche; 										// Variable die übergeben wird, wird lokal gespeichert
		double volumen = 0;
		boolean run = true;
		while(run){ 															//Solange run == true ist läuft die schleife endlos
			if(grundflaecheKlasse != Double.MIN_VALUE){ 						//der Wert wurde Standardmäßig auf MIN.VALUE gesetzt, Sollte dieser Wert noch vorhanden sein 
				Scanner userImput = new Scanner(System.in); 					//Wurde keine Grundflaeche ausgerechnet und muss demnach noch abgefragt werden. 
				System.out.print("Geben Sie nun die Höhe des Quaders an: ");
				double hoehe = userImput.nextDouble();  						//Hier wird sobald der Wert nicht mehr MIN.VALUE ist die höhe eingelesen und das Volumen berechnet. 
				volumen = grundflaecheKlasse * hoehe;
				run = false; 													//run bekommt nun den wert false damit die schleife beendet wird. Das Programm gibt Volume zurück. 
			}else{
				System.out.println("Bitte geben sie die Werte A und B der Grundseite des Rechtecks an: \n");
				grundflaecheKlasse = berechnungFlaeche.berechneRechteckFlaeche(); 
				run = true;	
			}
		}
		return volumen;
	}

		
	
	

}
