package calcolatrice;

import java.util.Scanner;

public class Calcolatrice {
	
	//Ciao assuero questa è una modifica!!!!!!

	public static void main(String[] args) {
		int valore1;
		int valore2;
		int risultato;
	 
		Scanner calcolatrice = new Scanner(System.in);
	 
		System.out.println("inserisci primo valore : ");
		valore1 = calcolatrice.nextInt();
	 
	 
		System.out.println("inserisci secondo valore : ");
		valore2 = calcolatrice.nextInt();
	 
		int somma = valore1 + valore2;
		int sottrazione = valore1 - valore2;
		int moltiplicazione = valore1 * valore2;
		int divisione = valore1 / valore2;
	 
		System.out.println("inserisci operazione : ");
		risultato = calcolatrice.nextInt();
	 
		switch (risultato)
		{
		case 1: 
			System.out.println("somma : "+somma);
			break;
		case 2: 
			System.out.println("sottrazione : "+sottrazione);
			break;
		case 3: 
			System.out.println("moltiplicazione : "+moltiplicazione);
			break;
		case 4: 
			System.out.println("divisione : "+divisione);
			break;
		default: 
			System.out.println("nessun risultato");
		}		 

	}

}
