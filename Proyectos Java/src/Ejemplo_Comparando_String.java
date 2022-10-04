import java.util.Scanner;

public class Ejemplo_Comparando_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase");
		frase = sc.nextLine();
		System.out.println("Esta es la frase: " + frase);
		frase = frase.toLowerCase();
		if (frase=="hola") {
			System.out.println("Son iguales");
		}
		
		if (frase.equals("hola")) {
			System.out.println("Son iguales");
		}
	}
}
