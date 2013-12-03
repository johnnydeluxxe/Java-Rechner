package zweiDimensionaleGeometrie;

public class berechnungUmfang {
	

	
	public static void umfangBerechnung(){
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("Bitte geben Sie den Wert der Seite A ein: ");
		double SeiteA = scanner.nextDouble();
		System.out.println("Bitte geben Sie den Wert der Seite B ein: ");
		double SeiteB = scanner.nextDouble();
		
		double ergebnisUmfang;
		ergebnisUmfang = (2*SeiteA) + (2*SeiteB);
		
		System.out.println("Der Umfang bertrŠgt: " + ergebnisUmfang);
		
		
	}

}
