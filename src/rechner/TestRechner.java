package rechner;

import zweiDimensionaleGeometrie.*;

import java.util.Scanner;

import dreiDimensionaleGeometrie.BerechnungVolumen;

public class TestRechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		double ergebnisRechteckFlaeche = Integer.MIN_VALUE;
		while(run == true){
			System.out.println("Was möchten Sie Rechnen?\n..............\n1: Flächeninhalt Kreis berechnen\n2: Umfang Berechnen\n3: Flächeninhalt Rechteck berechnen"
					+ "\n4: Flächeninhalt Dreieck berechnen\n5: Volumen Rechteck\n6: Mitternachtsformel\n7: Close");
	    	int eingabe = scanner.nextInt();
			switch(eingabe){
				case 1:
					berechnungFlaeche.berechneKreisFlaeche();
					break;
				case 2:
					berechnungUmfang.umfangBerechnung();
					break;
				case 3:
					ergebnisRechteckFlaeche = berechnungFlaeche.berechneRechteckFlaeche();
					System.out.println("Der Flächeninhalt des Rechtecks beträgt: " + ergebnisRechteckFlaeche);
					break;
				case 4:
					double ergebnis = berechnungFlaeche.berechneDreieckFlaeche();
					System.out.println("Der Flächeninhalt des Dreiecks beträgt: " + ergebnis);
					break;
				case 5:
					double ergebnisVolumen = BerechnungVolumen.berechneDreieckVolumen(ergebnisRechteckFlaeche);
					System.out.println("Das Volumen beträgt: " + ergebnisVolumen + "\n\n");
					break;
				case 6:
					Formel.mitternachtsformel();
					break;
				case 7:
					System.out.println("Bye");
					run=false;
					break;
				default:
					System.out.println("Falsche Eingabe!");
					
			}
		}
		
	}

}
