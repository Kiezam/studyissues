package zeitrechner;
import java.util.Scanner;

public class EidP_VL06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int auswahl = 0;
		int n;
		
					
		while(auswahl != 3) 
		{
			System.out.println
				(
					"----------------------------------------------------\n"
				+	"1		Teileranzahl für n\n"
				+	"2		Maximale Teileranzahl für die Zahlen 1 bis n\n"
				+	"3		Fertig\n"
				+	"----------------------------------------------------\n"
				);
		
			auswahl = scanner.nextInt();
		
			switch (auswahl) {
		
				case 1:
					System.out.println("Bitte geben Sie eine natürlich Zahl ein: ");
					n = scanner.nextInt();
					System.out.println("Die Teileranzahl für " + n + " ist " + berechneTeileranzahl(n));
					break;
					
				case 2:
					System.out.println("Bitte geben Sie eine natürliche Zahl ein: ");
					n = scanner.nextInt();
					System.out.println("Die maximale Teileranzahl für " + n + " ist " + berechneMaximaleTeileranzahl(n));
					break;
					
				case 3:
					System.out.println("Tschüss und bis zum nächsten mal.");
					break;
					
				default:
					System.out.println("Bitte geben Sie eine der 3 Möglichkeiten ein.");
			
		}
		
	}
				
}

	
	public static int berechneTeileranzahl (int n) {
		
		int anzahl = 0;
		
		int i = 1;
		
		while ( i <= n) {
			
			if (n % i == 0)
				anzahl++;
			i++;
			}
		return anzahl;
		}
	
	public static int berechneMaximaleTeileranzahl (int n) {
		
		int maxAnzahl = 0;
		for (int i = 1; i < n; i++) {
			
			int anzahlneu = berechneTeileranzahl(i);
			if (maxAnzahl < anzahlneu)
				maxAnzahl = anzahlneu;
			}
		
		return maxAnzahl;
		
			
	}
	
	
	

	
}
