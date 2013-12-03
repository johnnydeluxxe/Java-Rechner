package rechner;

import zweiDimensionaleGeometrie.*;

import java.util.Scanner;

public class TestRechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while(run == true){
			System.out.println("Was möchten Sie Rechnen?\n..............\n1: Flächeninhalt Kreis berechnen\n2: Umfang Berechnen\n3: Flächeninhalt Rechteck berechnen"
					+ "\n4: Flächeninhalt Dreieck berechnen\n5: Mitternachtsformel\n6: Close");
	    	int eingabe = scanner.nextInt();
			switch(eingabe){
				case 1:
					berechnungFlaeche.berechneKreisFlaeche();
					break;
				case 2:
					berechnungUmfang.umfangBerechnung();
					break;
				case 3:
					berechnungFlaeche.berechneRechteckFlaeche();
					break;
				case 4:
					//Scanner scanner = new Scanner(System.in);
					System.out.println("Wie groß ist die Grundfläche?: ");
					double grundflaeche = scanner.nextInt();
					System.out.println("Wie groß ist die Höhe?: ");
					double hoehe = scanner.nextInt();
					berechnungFlaeche berechnen = new berechnungFlaeche();
					double ergebnis = berechnen.berechneDreieckFlaeche(grundflaeche, hoehe);
					System.out.println("Der Flächeninhalt des Dreiecks beträgt: " + ergebnis);
					break;
				case 5:
					Formel.mitternachtsformel();
					break;
				case 6:
					System.out.println("Bye");
					run=false;
					break;
				default:
					System.out.println("Falsche Eingabe!");
					
			}
		}
		
	}

}
