import java.util.Scanner;

public class T3_Ejercicio6_pag13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		int vocal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una frase:");
		frase = sc.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			
			switch (vocal.charAt(i)) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": vocal++;break;
			}
		}
		System.out.println("El numero de vocales es: " + vocal);
	}

}
