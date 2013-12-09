package zweiDimensionaleGeometrie;

import java.util.Scanner;

public class berechnungFlaeche {
		
	public static void berechneKreisFlaeche(){
		double flaechenInhalt = 0;
		//double pi = 3.14159;
		double eingabeRadius = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie gross ist der Radius: ");
		eingabeRadius = scanner.nextDouble();
		
		flaechenInhalt = java.lang.Math.PI *(eingabeRadius*eingabeRadius);
		
		System.out.println("Der Flächeninhalt beträgt: " + flaechenInhalt);
		
		boolean runden = false;
		System.out.println("Möchten Sie das ergebnis Runden (j/n)?");
		String rundenEingabe = scanner.next();
		if (rundenEingabe == "j" || rundenEingabe == "J"){
			runden=true;
		}else{
			
			runden=false;
		}
		
		if (runden){
			System.out.println("Auf welche Stelle nach dem Komma möchten Sie Runden? (Ganze Zahl): ");
			//int zahlRound = scanner.nextInt();
			// Code um Zahl auf stelle "zahlRound" zu runden!!!!!!
		}else{
			System.out.println("Das Ergebnis beleibt: " + flaechenInhalt);
			
		}	
	}
	
	public static double berechneRechteckFlaeche(){
		double flaechenInhalt = 0;
		double seiteA = 0;
		double seiteB = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie lang ist Seite A? ");
		seiteA = scanner.nextDouble();
		System.out.println("Wie lang ist Seite B? ");
		seiteB = scanner.nextDouble();
		
		flaechenInhalt = seiteA * seiteB;
		
		
		
		return flaechenInhalt;
	}
	
	
	
	
	public static double berechneDreieckFlaeche(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie groß ist die Grundfläche?: ");
		double g = scanner.nextDouble();
		System.out.println("Wie groß ist die Höhe?: ");
		double h = scanner.nextInt();
		
		double flaecheDreieck = 0;
		
		flaecheDreieck = 0.5 * g * h;
		
		return flaecheDreieck;
		
		// 1/2 * g * h 
		
	}
}
