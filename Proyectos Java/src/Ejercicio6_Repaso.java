import java.util.Scanner;

public class Ejercicio6_Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		int contador;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase");
		frase = sc.nextLine();
		
		if (frase.length() > 0) {
			contador = frase.length()-1;
			while (contador >= 0) {
				System.out.print(frase.charAt(contador));
				contador--;
			}
		} else {
			System.out.println("No ha escrito ninguna frase");
		}
	}
}
